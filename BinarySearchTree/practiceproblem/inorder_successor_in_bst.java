package BinarySearchTree.practiceproblem;

import java.util.Stack;
import BinarySearchTree.TreeNode;

public class inorder_successor_in_bst {
    public int inorderSuccessor(TreeNode root, TreeNode x) {
        if (root == null || x == null)
            return -1;

        Stack<TreeNode> st = new Stack<>();
        TreeNode current = root;
        boolean found = false;

        while (!st.isEmpty() || current != null) {
            // Traverse to the leftmost node
            while (current != null) {
                st.push(current);
                current = current.left;
            }

            // Process the node
            current = st.pop();

            if (found) {
                // If we've already seen the target node, return the current node as successor
                return current.val;
            }
            if (current == x) {
                found = true; // Mark that we found the target node
            }

            // Move to the right subtree
            current = current.right;
        }

        // If no successor is found
        return -1;
    }
}
