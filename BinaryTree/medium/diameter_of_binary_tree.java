package BinaryTree.medium;

import BinaryTree.TreeNode;
public class diameter_of_binary_tree {
    int maxDiameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
          calculateDepth(root);
        return maxDiameter;
    }

    private int calculateDepth(TreeNode node) {
        if (node == null) return 0;

        // Calculate the depth of left and right subtrees
        int leftDepth = calculateDepth(node.left);
        int rightDepth = calculateDepth(node.right);

        // Update the maximum diameter
        maxDiameter = Math.max(maxDiameter, leftDepth + rightDepth);

        // Return the depth of this node
        return 1 + Math.max(leftDepth, rightDepth);
    }
}
