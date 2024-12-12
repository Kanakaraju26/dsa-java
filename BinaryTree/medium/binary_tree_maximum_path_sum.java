package BinaryTree.medium;

import BinaryTree.TreeNode;
public class binary_tree_maximum_path_sum {
    int maxPathSum = 0;
    public int maxPathSum(TreeNode root) {
        maxPathSum = Integer.MIN_VALUE; // Initialize to smallest value
        calculatePathSum(root);
        return maxPathSum;
    }

    private int calculatePathSum(TreeNode node) {
        if (node == null) return 0;

        // Compute left and right max gains (ignore negative sums by taking max with 0)
        int leftGain = Math.max(0, calculatePathSum(node.left));
        int rightGain = Math.max(0, calculatePathSum(node.right));

        // Current path sum including this node
        int currentPathSum = node.val + leftGain + rightGain;

        // Update global maxPathSum if the current path sum is greater
        maxPathSum = Math.max(maxPathSum, currentPathSum);

        // Return max gain if the path goes through this node to its parent
        return node.val + Math.max(leftGain, rightGain);
    }
}
