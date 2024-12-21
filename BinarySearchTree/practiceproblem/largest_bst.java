package BinarySearchTree.practiceproblem;

import BinarySearchTree.TreeNode;
public class largest_bst {
    static class NodeInfo {
        boolean isBST;
        int size;
        int min;
        int max;

        NodeInfo(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    static int largestBst(TreeNode root) {
        return findLargestBst(root).size;
    }

    static NodeInfo findLargestBst(TreeNode node) {
        if (node == null) {
            // An empty tree is a BST with size 0
            return new NodeInfo(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        // Recursively gather information about the left and right subtrees
        NodeInfo leftInfo = findLargestBst(node.left);
        NodeInfo rightInfo = findLargestBst(node.right);

        // Check if the current subtree is a BST
        if (leftInfo.isBST && rightInfo.isBST && node.val > leftInfo.max && node.val < rightInfo.min) {
            // The current subtree is a BST
            int size = leftInfo.size + rightInfo.size + 1;
            int min = Math.min(node.val, leftInfo.min);
            int max = Math.max(node.val, rightInfo.max);
            return new NodeInfo(true, size, min, max);
        }

        // If not a BST, return the size of the largest BST found in the subtrees
        return new NodeInfo(false, Math.max(leftInfo.size, rightInfo.size), 0, 0);
    }
}
