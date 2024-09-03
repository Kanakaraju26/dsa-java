package javaBasic;

import java.util.LinkedHashMap;
import java.util.Map;
//LinkedHashMap .put .get .containsKey .remove .size .isEmpty Map.Entry<Integer, String> entry : map.entrySet()  keySet  keyValues

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Create a LinkedHashMap to store Integer keys and String values
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // Add key-value pairs to the LinkedHashMap
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Date");
        map.put(2, "Blueberry"); // Duplicate key (value will be updated)
        System.out.println("LinkedHashMap after adding elements: " + map);

        // Retrieve a value based on a key
        String value = map.get(2);
        System.out.println("Value associated with key '2': " + value);

        // Check if a key exists
        boolean containsKey1 = map.containsKey(1);
        boolean containsKey5 = map.containsKey(5);
        System.out.println("Does LinkedHashMap contain key '1'? " + containsKey1);
        System.out.println("Does LinkedHashMap contain key '5'? " + containsKey5);

        // Remove a key-value pair
        map.remove(3);
        System.out.println("LinkedHashMap after removing key '3': " + map);

        // Check the size of the LinkedHashMap
        int size = map.size();
        System.out.println("Size of LinkedHashMap: " + size);

        // Check if the LinkedHashMap is empty
        boolean isEmpty = map.isEmpty();
        System.out.println("Is LinkedHashMap empty? " + isEmpty);

        // Iterate over the key-value pairs in the LinkedHashMap
        System.out.println("Iterating over LinkedHashMap:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Retrieve all keys and values
        System.out.println("Keys in LinkedHashMap: " + map.keySet());
        System.out.println("Values in LinkedHashMap: " + map.values());

        // Clear all key-value pairs from the LinkedHashMap
        map.clear();
        System.out.println("LinkedHashMap after clearing all elements: " + map);
        System.out.println("Is LinkedHashMap empty after clearing? " + map.isEmpty());
    }
}

