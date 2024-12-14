package BinaryTree.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import BinaryTree.TreeNode;
public class boundary_of_binary_tree {
    public static List<Integer> traverseBoundary(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        // Add root node (only if it's not a leaf)
        if (!isLeaf(root)) result.add(root.val);

        // Add left boundary nodes (excluding root and leaf nodes)
        addLeftBoundary(root.left, result);

        // Add all leaf nodes
        addLeaves(root, result);

        // Add right boundary nodes (excluding root and leaf nodes, in reverse)
        List<Integer> rightBoundary = new ArrayList<>();
        addRightBoundary(root.right, rightBoundary);
        Collections.reverse(rightBoundary);
        result.addAll(rightBoundary);

        return result;
    }

    private static boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }

    private static void addLeftBoundary(TreeNode node, List<Integer> result) {
        while (node != null) {
            if (!isLeaf(node)) result.add(node.val);
            node = (node.left != null) ? node.left : node.right;
        }
    }

    private static void addLeaves(TreeNode node, List<Integer> result) {
        if (node == null) return;
        if (isLeaf(node)) {
            result.add(node.val);
            return;
        }
        addLeaves(node.left, result);
        addLeaves(node.right, result);
    }

    private static void addRightBoundary(TreeNode node, List<Integer> result) {
        while (node != null) {
            if (!isLeaf(node)) result.add(node.val);
            node = (node.right != null) ? node.right : node.left;
        }
    }
}
