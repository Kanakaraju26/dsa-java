package BinaryTree.hard;

import java.util.*;
import BinaryTree.*;

public class root_to_leaf_paths {
    public static ArrayList<ArrayList<Integer>> Paths(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (root == null) return res;
    
        // Start recursion with an empty path
        findPaths(root, new ArrayList<>(), res);
        return res;
    }
    
    // Helper function to find paths
    private static void findPaths(TreeNode node, ArrayList<Integer> currentPath, ArrayList<ArrayList<Integer>> res) {
        if (node == null) return;
    
        // Add the current node's value to the path
        currentPath.add(node.val);
    
        // If it's a leaf node, add the current path to the result
        if (node.left == null && node.right == null) {
            res.add(new ArrayList<>(currentPath));
        } else {
            // Recur for left and right subtrees
            findPaths(node.left, currentPath, res);
            findPaths(node.right, currentPath, res);
        }
    
        // Backtrack: remove the last node to explore other paths
        currentPath.remove(currentPath.size() - 1);
    }
}
