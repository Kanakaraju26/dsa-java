package BinarySearchTree.Concept;
import BinarySearchTree.*;
public class maximum_element_in_bst {
    int maxValue(TreeNode root) {
        // code here
        int max = Integer.MIN_VALUE;
        while(root!=null){
            if(root.val > max) max = root.val;
            root=root.right;
        }
        return max;
    }
}
