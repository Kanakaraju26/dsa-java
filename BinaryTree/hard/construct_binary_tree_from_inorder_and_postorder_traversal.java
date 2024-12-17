public class construct_binary_tree_from_inorder_and_postorder_traversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTreeHelper(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
   }
   
   private TreeNode buildTreeHelper(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd) {
       // Base case: no elements to construct the tree
       if (inStart > inEnd || postStart > postEnd) {
           return null;
       }
       
       // The root is the last element in the current postorder range
       int rootValue = postorder[postEnd];
       TreeNode root = new TreeNode(rootValue);
       
       // Find the root in inorder array
       int inRootIndex = inStart; // Initialize index for the root in inorder
       while (inorder[inRootIndex] != rootValue) {
           inRootIndex++;
       }
       
       // Calculate the size of the left subtree
       int leftTreeSize = inRootIndex - inStart;
       
       // Recursively construct the left subtree
       root.left = buildTreeHelper(inorder, inStart, inRootIndex - 1, postorder, postStart, postStart + leftTreeSize - 1);
       
       // Recursively construct the right subtree
       root.right = buildTreeHelper(inorder, inRootIndex + 1, inEnd, postorder, postStart + leftTreeSize, postEnd - 1);
       
       return root;
   }
}
