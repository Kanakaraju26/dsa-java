package BinarySearchTree.Concept;
import BinarySearchTree.*;
public class search_in_a_binary_search_tree {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null) return null;
        while(root!=null){
            if(root.val<val) root=root.right;
            else if(root.val>val) root=root.left;
            else return root;
        }
        return null;
    }
}
