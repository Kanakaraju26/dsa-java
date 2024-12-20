package BinarySearchTree.practiceproblem;

import java.util.ArrayList;
import java.util.Stack;
import BinarySearchTree.*;
public class validate_binary_search_tree {
    public boolean isValidBST(TreeNode root) {
    if(root.left==null && root.right==null) return true;
    ArrayList<Integer> arr = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();
    TreeNode current = root;

    while (current != null || !stack.isEmpty()) {
        while (current != null) {
            stack.push(current);
            current = current.left;
        }
        current = stack.pop();
        arr.add(current.val);
        current = current.right;
    }
    long max = Long.MIN_VALUE;
    for(int i:arr){
        if(i>max) max = i;
        else return false;
    }
    return true;
    }
}
