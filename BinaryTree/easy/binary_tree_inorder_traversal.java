import java.util.ArrayList;
import java.util.List;

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

public class binary_tree_inorder_traversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root,arr);
        return arr;
    }
    public static void inorder(TreeNode root,ArrayList<Integer> ls){
        if(root==null) return;
        inorder(root.left,ls);
        ls.add(root.val);
        inorder(root.right,ls);
    }
}
