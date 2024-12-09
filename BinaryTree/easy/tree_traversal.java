
import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode() {
        this.data = 0;
        this.left = null;
        this.right = null;
    }
    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    TreeNode(int data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
};

public class tree_traversal {
    public static List<List<Integer>> getTreeTraversal(TreeNode root) {
        // Write your code here.
        List<Integer> inOrder = new ArrayList<>();
        List<Integer> preOrder = new ArrayList<>();
        List<Integer> postOrder = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        // Call helper functions for each traversal
        inOrderTraversal(root, inOrder);
        preOrderTraversal(root, preOrder);
        postOrderTraversal(root, postOrder);

        // Combine all results into one list
        result.add(inOrder);
        result.add(preOrder);
        result.add(postOrder);
        return result;
    }

    private static void inOrderTraversal(TreeNode node, List<Integer> inOrder) {
        if (node == null) return;
        inOrderTraversal(node.left, inOrder);  // Visit left
        inOrder.add(node.data);                // Visit root
        inOrderTraversal(node.right, inOrder);// Visit right
    }

    private static void preOrderTraversal(TreeNode node, List<Integer> preOrder) {
        if (node == null) return;
        preOrder.add(node.data);               // Visit root
        preOrderTraversal(node.left, preOrder); // Visit left
        preOrderTraversal(node.right, preOrder); // Visit right
    }

    private static void postOrderTraversal(TreeNode node, List<Integer> postOrder) {
        if (node == null) return;
        postOrderTraversal(node.left, postOrder); // Visit left
        postOrderTraversal(node.right, postOrder); // Visit right
        postOrder.add(node.data);                 // Visit root
    }
}
