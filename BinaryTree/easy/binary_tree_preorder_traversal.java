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

public class binary_tree_preorder_traversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        preorder(root, arr);
        return arr;
    }

    public static void preorder(TreeNode root, List<Integer> ls) {
        if (root == null)
            return;
        ls.add(root.val);
        preorder(root.left, ls);
        preorder(root.right, ls);
    }
}
