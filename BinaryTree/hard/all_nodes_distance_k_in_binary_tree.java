// package BinaryTree.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
// import BinaryTree.*;
public class all_nodes_distance_k_in_binary_tree {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> result = new ArrayList<>();
        if (root == null || target == null) return result;

        // Step 1: Build the parent map
        Map<TreeNode, TreeNode> parentMap = new HashMap<>();
        buildParentMap(root, null, parentMap);

        // Step 2: Perform BFS from the target node
        Queue<TreeNode> queue = new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();
        
        queue.add(target);
        visited.add(target);

        int currentDistance = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            if (currentDistance == k) {
                for (TreeNode node : queue) {
                    result.add(node.val);
                }
                return result;
            }

            for (int i = 0; i < size; i++) {
                TreeNode currentNode = queue.poll();

                // Explore neighbors: left, right, and parent
                if (currentNode.left != null && !visited.contains(currentNode.left)) {
                    queue.add(currentNode.left);
                    visited.add(currentNode.left);
                }

                if (currentNode.right != null && !visited.contains(currentNode.right)) {
                    queue.add(currentNode.right);
                    visited.add(currentNode.right);
                }

                TreeNode parent = parentMap.get(currentNode);
                if (parent != null && !visited.contains(parent)) {
                    queue.add(parent);
                    visited.add(parent);
                }
            }

            currentDistance++;
        }

        return result;
    }

    // Helper function to build parent pointers
    private void buildParentMap(TreeNode node, TreeNode parent, Map<TreeNode, TreeNode> parentMap) {
        if (node == null) return;
        if (parent != null) {
            parentMap.put(node, parent);
        }
        buildParentMap(node.left, node, parentMap);
        buildParentMap(node.right, node, parentMap);
    }
}
