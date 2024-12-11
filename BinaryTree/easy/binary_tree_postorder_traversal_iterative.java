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
public class binary_tree_postorder_traversal_iterative {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        TreeNode prev = null;

        while (!stack.isEmpty() || current != null) {
            // Push all left children onto the stack
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            // Peek the node at the top of the stack
            TreeNode node = stack.peek();

            // If right child is unvisited, traverse the right subtree
            if (node.right != null && node.right != prev) {
                current = node.right;
            } else {
                // Process the current node
                result.add(node.val);
                stack.pop();
                prev = node; // Mark this node as visited
            }
        }

        return result;
    }
}
