public class flatten_binary_tree_to_linked_list {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        // Recursively flatten the left and right subtrees
        flatten(root.left);
        flatten(root.right);

        // Find the rightmost node of the left subtree
        TreeNode rightmost = root.left;
        while (rightmost != null && rightmost.right != null) {
            rightmost = rightmost.right;
        }

        // Connect the rightmost node of the left subtree to the root's right child
        if (rightmost != null) {
            rightmost.right = root.right;
            root.right = root.left;
        }

        // Set the left child of the root to null
        root.left = null;
    }
}
