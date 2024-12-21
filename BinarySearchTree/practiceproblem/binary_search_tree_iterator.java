package BinarySearchTree.practiceproblem;
import BinarySearchTree.TreeNode;
import java.util.Stack;

public class binary_search_tree_iterator {
    private Stack<TreeNode> stack;

    // Constructor
    public binary_search_tree_iterator(TreeNode root) {
        stack = new Stack<>();
        pushLeftNodes(root);
    }

    // Return the next smallest number
    public int next() {
        TreeNode node = stack.pop(); // Get the topmost node
        if (node.right != null) {
            pushLeftNodes(node.right); // Push left nodes of the right subtree
        }
        return node.val; // Return the value of the current node
    }

    // Check if there are more elements in the BST
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    // Helper function to push all left nodes onto the stack
    private void pushLeftNodes(TreeNode node) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }
}
