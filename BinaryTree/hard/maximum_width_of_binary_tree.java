package BinaryTree.hard;

import java.util.LinkedList;
import java.util.Queue;
import BinaryTree.*;
public class maximum_width_of_binary_tree {
    public int widthOfBinaryTree(TreeNode root) {
         if (root == null) return 0;

        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        queue.add(new Pair<>(root, 0));
        int maxWidth = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            int minIndex = queue.peek().getValue(); // Minimum index at the level
            int first = 0, last = 0;

            for (int i = 0; i < size; i++) {
                Pair<TreeNode, Integer> current = queue.poll();
                TreeNode node = current.getKey();
                int index = current.getValue() - minIndex; // Normalize to avoid overflow

                if (i == 0) first = index; // First node index
                if (i == size - 1) last = index; // Last node index

                // Add child nodes to the queue with their corresponding indices
                if (node.left != null) queue.add(new Pair<>(node.left, 2 * index));
                if (node.right != null) queue.add(new Pair<>(node.right, 2 * index + 1));
            }

            maxWidth = Math.max(maxWidth, last - first + 1);
        }

        return maxWidth;
    }

    static class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
}
