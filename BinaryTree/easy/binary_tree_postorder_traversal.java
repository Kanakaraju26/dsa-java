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
public class binary_tree_postorder_traversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        postorder(root,arr);
        return arr;
    }
    public static void postorder(TreeNode root,ArrayList<Integer> ls){
        if(root==null) return;
        postorder(root.left,ls);
        postorder(root.right,ls);
        ls.add(root.val);
    }
}
