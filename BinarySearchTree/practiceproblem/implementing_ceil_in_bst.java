package BinarySearchTree.practiceproblem;
import BinarySearchTree.*;
public class implementing_ceil_in_bst {
    int findCeil(TreeNode root, int key) {
        if (root == null) return -1;
        // Code here
         int ceil = -1; // Initialize ceil as -1 (not found).

    while (root != null) {
        if (root.val == key) {
            return root.val; // Exact match for key, return it as ceil.
        }
        if (root.val > key) {
            ceil = root.val; // Potential ceil found.
            root = root.left; // Move to the left subtree to find a smaller ceil.
        } else {
            root = root.right; // Move to the right subtree.
        }
    }
    return ceil;
    }
}
