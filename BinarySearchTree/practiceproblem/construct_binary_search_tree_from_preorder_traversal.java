package BinarySearchTree.practiceproblem;
import BinarySearchTree.*;
public class construct_binary_search_tree_from_preorder_traversal {
    private int index = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return constructBST(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    private TreeNode constructBST(int[] preorder, int min, int max) {
        // Base case: if index is out of bounds or the current value is out of range
        if (index >= preorder.length || preorder[index] < min || preorder[index] > max) {
            return null;
        }

        // Create the root node for the current subtree
        int value = preorder[index++];
        TreeNode root = new TreeNode(value);

        // Recursively construct the left and right subtrees
        root.left = constructBST(preorder, min, value);
        root.right = constructBST(preorder, value, max);

        return root;
    }
}
