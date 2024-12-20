package BinarySearchTree.practiceproblem;
import BinarySearchTree.*;
public class lowest_common_ancestor_of_a_binary_search_tree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            // If both nodes are smaller than root, move to the left subtree.
            if (p.val < root.val && q.val < root.val) {
                root = root.left;
            }
            // If both nodes are larger than root, move to the right subtree.
            else if (p.val > root.val && q.val > root.val) {
                root = root.right;
            }
            // If one node is on the left and the other is on the right, the root is the LCA.
            else {
                return root;
            }
        }
        return null; // This case shouldn't happen if p and q are guaranteed to exist in the tree.
    } 
}
