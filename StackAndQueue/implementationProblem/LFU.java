package StackAndQueue.implementationProblem;

import java.util.HashMap;
import java.util.Map;

public class LFU {
    class CacheNode {
        int key, value, frequency;
        CacheNode prev, next;

        CacheNode(int key, int value) {
            this.key = key;
            this.value = value;
            this.frequency = 1; // 🔢 Frequency starts at 1
        }
    }

    // 🔗 Doubly Linked List to store nodes with the same frequency
    class FrequencyList {
        CacheNode head, tail; // 🛑 Dummy head and tail for easy insertion/removal
        int size; // 📏 Number of nodes in the list

        FrequencyList() {
            head = new CacheNode(0, 0); // 🪧 Dummy head node
            tail = new CacheNode(0, 0); // 🪧 Dummy tail node
            head.next = tail;
            tail.prev = head;
            size = 0;
        }

        // 🆕 Add a new node to the front (most recently used in this frequency)
        void addNodeToFront(CacheNode node) {
            CacheNode firstNode = head.next;
            head.next = node;
            node.prev = head;
            node.next = firstNode;
            firstNode.prev = node;
            size++;
        }

        // 🗑️ Remove a specific node
        void removeNode(CacheNode node) {
            CacheNode prevNode = node.prev;
            CacheNode nextNode = node.next;
            prevNode.next = nextNode;
            nextNode.prev = prevNode;
            size--;
        }

        // 🚪 Remove and return the least recently used node (last in the list)
        CacheNode removeLastNode() {
            if (size > 0) {
                CacheNode lastNode = tail.prev;
                removeNode(lastNode);
                return lastNode;
            }
            return null;
        }
    }

    // 🌟 Cache properties
    private int cacheCapacity, minFrequency;
    private Map<Integer, CacheNode> keyToCacheNode; // 🗂️ Maps key -> node
    private Map<Integer, FrequencyList> frequencyToList; // 🔗 Maps frequency -> DLL of nodes

    // 🔧 Constructor
    public LFU(int capacity) {
        this.cacheCapacity = capacity;
        this.minFrequency = 0; // 🔢 Minimum frequency starts at 0
        this.keyToCacheNode = new HashMap<>();
        this.frequencyToList = new HashMap<>();
    }

    // 🎯 Get the value of a key
    public int get(int key) {
        if (!keyToCacheNode.containsKey(key)) {
            return -1; // 🚫 Key not found
        }

        CacheNode node = keyToCacheNode.get(key);
        updateNodeFrequency(node); // 🔄 Update frequency on access
        return node.value;
    }

    // ✍️ Insert or update a key-value pair
    @SuppressWarnings("unused")
    public void put(int key, int value) {
        if (cacheCapacity == 0) return; // 🚫 No capacity, do nothing

        if (keyToCacheNode.containsKey(key)) {
            CacheNode node = keyToCacheNode.get(key);
            node.value = value; // 🖊️ Update value
            updateNodeFrequency(node); // 🔄 Update frequency
            return;
        }

        if (keyToCacheNode.size() >= cacheCapacity) {
            // 🗑️ Evict the least frequently used node
            FrequencyList minFreqList = frequencyToList.get(minFrequency);
            CacheNode nodeToRemove = minFreqList.removeLastNode();
            keyToCacheNode.remove(nodeToRemove.key);
        }

        // 🆕 Add new node
        CacheNode newNode = new CacheNode(key, value);
        keyToCacheNode.put(key, newNode);
        minFrequency = 1; // Reset `minFrequency` to 1
        frequencyToList.computeIfAbsent(1, k -> new FrequencyList()).addNodeToFront(newNode);
    }

    // 🔄 Update a node's frequency
    @SuppressWarnings("unused")
    private void updateNodeFrequency(CacheNode node) {
        int oldFreq = node.frequency;
        FrequencyList oldFreqList = frequencyToList.get(oldFreq);
        oldFreqList.removeNode(node); // 🗑️ Remove from current frequency list

        // 🌟 If list is empty and matches `minFrequency`, increment `minFrequency`
        if (oldFreq == minFrequency && oldFreqList.size == 0) {
            minFrequency++;
        }

        // 🔢 Increase frequency and move to the new frequency list
        node.frequency++;
        frequencyToList.computeIfAbsent(node.frequency, k -> new FrequencyList()).addNodeToFront(node);
    }
}