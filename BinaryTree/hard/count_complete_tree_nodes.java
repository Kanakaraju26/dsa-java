
// import BinaryTree.*;
public class count_complete_tree_nodes {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;

        // Calculate the depth of the leftmost path
        int leftDepth = getDepth(root, true);
        // Calculate the depth of the rightmost path
        int rightDepth = getDepth(root, false);

        // If left and right depths are the same, it's a perfect binary tree
        if (leftDepth == rightDepth) {
            return (1 << leftDepth) - 1; // 2^h - 1 nodes
        }

        // Otherwise, recursively calculate the number of nodes
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    // Helper function to calculate the depth of the tree
    private static int getDepth(TreeNode node, boolean isLeft) {
        int depth = 0;
        while (node != null) {
            depth++;
            node = isLeft ? node.left : node.right;
        }
        return depth;
    }
}
