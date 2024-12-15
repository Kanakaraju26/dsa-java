package BinaryTree.hard;

import BinaryTree.*;
public class lowest_common_ancestor_of_a_binary_tree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
        return root; // Base case: root is null, p, or q
    }

    // Recursively search in left and right subtrees
    TreeNode left = lowestCommonAncestor(root.left, p, q);
    TreeNode right = lowestCommonAncestor(root.right, p, q);

    if (left != null && right != null) {
        return root; // p and q found in different subtrees
    }
    return left != null ? left : right; 
    }
}
