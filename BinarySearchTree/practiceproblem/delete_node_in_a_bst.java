package BinarySearchTree.practiceproblem;
import BinarySearchTree.*;
public class delete_node_in_a_bst {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
        // If the tree is empty or the key is not found.
        return null;
    }

    // Traverse the tree to find the node to delete.
    if (key < root.val) {
        root.left = deleteNode(root.left, key); // Go to the left subtree.
    } else if (key > root.val) {
        root.right = deleteNode(root.right, key); // Go to the right subtree.
    } else {
        // Node to be deleted is found.

        // Case 1: Node has no children or is a leaf node.
        if (root.left == null && root.right == null) {
            return null;
        }

        // Case 2: Node has one child.
        if (root.left == null) {
            return root.right; // Replace with the right child.
        } else if (root.right == null) {
            return root.left; // Replace with the left child.
        }

        // Case 3: Node has two children.
        // Find the in-order successor (smallest node in the right subtree).
        TreeNode successor = findMin(root.right);
        // Replace the value of the current node with the successor's value.
        root.val = successor.val;
        // Delete the in-order successor node from the right subtree.
        root.right = deleteNode(root.right, successor.val);
    }

    return root; // Return the updated root.
}

// Helper method to find the minimum value node in a subtree.
private TreeNode findMin(TreeNode node) {
    while (node.left != null) {
        node = node.left; // Go to the leftmost node.
    }
    return node;
}
    
}
