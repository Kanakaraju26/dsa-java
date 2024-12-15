package BinaryTree.hard;

import BinaryTree.*;
public class children_sum_parent {
    public static int isSumProperty(TreeNode root) {
        // Helper function to check the property
        return checkSumProperty(root) ? 1 : 0;
    }

    // Helper function to check sum property recursively
    private static boolean checkSumProperty(TreeNode node) {
        // If the node is null, it's valid (consider it as 0)
        if (node == null) {
            return true;
        }

        // If it's a leaf node, it's valid (because leaf nodes satisfy the property)
        if (node.left == null && node.right == null) {
            return true;
        }

        // Sum of left and right child data (consider 0 for null children)
        int leftData = (node.left != null) ? node.left.val : 0;
        int rightData = (node.right != null) ? node.right.val : 0;

        // Check if the current node's data is equal to the sum of its children's data
        if (node.val == leftData + rightData) {
            // Recursively check the left and right subtrees
            return checkSumProperty(node.left) && checkSumProperty(node.right);
        }

        // If the current node's data doesn't equal the sum of its children's data, return false
        return false;
    }
}
