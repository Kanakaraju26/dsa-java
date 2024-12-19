package BinarySearchTree.practiceproblem;
import BinarySearchTree.*;
public class floor_in_bst {
    public static int floor(TreeNode root, int x) {
        // Code here
        if (root == null) return -1; // If the tree is empty, return -1.

    int floor = -1; // Initialize floor as -1 (not found).

    while (root != null) {
        if (root.val == x) {
            return root.val; // Exact match for x, return it as the floor.
        }
        if (root.val < x) {
            floor = root.val; // Potential floor found.
            root = root.right; // Move to the right subtree to find a larger valid value.
        } else {
            root = root.left; // Move to the left subtree.
        }
    }

    return floor;
    }
}
