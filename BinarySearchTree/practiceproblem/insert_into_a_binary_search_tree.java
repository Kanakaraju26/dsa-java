package BinarySearchTree.practiceproblem;
import BinarySearchTree.*;  
public class insert_into_a_binary_search_tree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
        // If the tree is empty, create a new root node with the given value.
        return new TreeNode(val);
    }

    TreeNode current = root;

    while (true) {
        if (val < current.val) {
            // Go to the left subtree.
            if (current.left == null) {
                // Insert the value as a left child if the left child is null.
                current.left = new TreeNode(val);
                break;
            } else {
                current = current.left;
            }
        } else {
            // Go to the right subtree.
            if (current.right == null) {
                // Insert the value as a right child if the right child is null.
                current.right = new TreeNode(val);
                break;
            } else {
                current = current.right;
            }
        }
    }

    return root;
    }
}
