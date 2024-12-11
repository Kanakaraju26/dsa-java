import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class binary_tree_inorder_traversal_iterative {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            // Traverse to the leftmost node.
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            // Pop the node from the stack.
            current = stack.pop();
            result.add(current.val); // Process the node.

            // Move to the right child.
            current = current.right;
        }

        return result;
    }
}
