public class construct_binary_tree_from_preorder_and_inorder_traversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // Helper function with indices to avoid copying arrays
      return buildTreeHelper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
  }
  
  private TreeNode buildTreeHelper(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
      // Base case: no elements to construct the tree
      if (preStart > preEnd || inStart > inEnd) {
          return null;
      }
      
      // The first element in preorder is the root of the subtree
      int rootValue = preorder[preStart];
      TreeNode root = new TreeNode(rootValue);
      
      // Find the root in inorder array to divide left and right subtrees
      int inRootIndex = inStart; // Initialize index for the root in inorder
      while (inorder[inRootIndex] != rootValue) {
          inRootIndex++;
      }
      
      // Calculate the size of the left subtree
      int leftTreeSize = inRootIndex - inStart;
      
      // Recursively construct the left subtree
      root.left = buildTreeHelper(preorder, preStart + 1, preStart + leftTreeSize, inorder, inStart, inRootIndex - 1);
      
      // Recursively construct the right subtree
      root.right = buildTreeHelper(preorder, preStart + leftTreeSize + 1, preEnd, inorder, inRootIndex + 1, inEnd);
      
      return root;
  }
}
