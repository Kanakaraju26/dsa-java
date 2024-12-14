package BinaryTree.medium;

import BinaryTree.*;
public class symmetric_tree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
           return true; // An empty tree is symmetric
       }
       
       // Check if the left and right subtrees are mirrors of each other
       return isMirror(root.left, root.right);
   }

   // Helper function to check if two trees are mirrors of each other
   private boolean isMirror(TreeNode t1, TreeNode t2) {
       if (t1 == null && t2 == null) {
           return true; // Both nodes are null, so they are symmetric
       }
       
       if (t1 == null || t2 == null) {
           return false; // One of the nodes is null, so they are not symmetric
       }
       
       // Check if the current nodes' values are equal and their subtrees are mirrors of each other
       return (t1.val == t2.val)
           && isMirror(t1.left, t2.right) // Left subtree of t1 and right subtree of t2
           && isMirror(t1.right, t2.left); // Right subtree of t1 and left subtree of t2
   }
}
