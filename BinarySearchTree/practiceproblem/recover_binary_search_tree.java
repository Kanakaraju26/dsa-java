package BinarySearchTree.practiceproblem;
import BinarySearchTree.TreeNode;
public class recover_binary_search_tree {
    TreeNode first = null;
    TreeNode second = null;
    TreeNode prev = null;

    public void recoverTree(TreeNode root) {
        // Step 1: Identify the swapped nodes using in-order traversal
        inorderTraversal(root);

        // Step 2: Swap the values of the two nodes
        if (first != null && second != null) {
            int temp = first.val;
            first.val = second.val;
            second.val = temp;
        }
    }

    private void inorderTraversal(TreeNode node) {
        if (node == null) return;

        // In-order traversal: left -> current -> right
        inorderTraversal(node.left);

        // Detect swapped nodes
        if (prev != null && prev.val > node.val) {
            // First violation: Record the first node
            if (first == null) {
                first = prev;
            }
            // Second violation: Record the second node
            second = node;
        }
        prev = node; // Update prev

        inorderTraversal(node.right);
    }
}
