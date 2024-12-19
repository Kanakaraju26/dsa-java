package BinarySearchTree.Concept;
import BinarySearchTree.*;

public class minimum_element_in_bst {
    int minValue(TreeNode root) {
        // code here
        int min = Integer.MAX_VALUE;
        while(root!=null){
            if(root.val < min) min = root.val;
            root=root.left;
        }
        return min;
    }
}
