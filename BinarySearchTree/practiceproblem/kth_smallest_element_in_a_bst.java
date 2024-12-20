package BinarySearchTree.practiceproblem;

import java.util.ArrayList;
import java.util.Stack;
import BinarySearchTree.*;
public class kth_smallest_element_in_a_bst {
    public int kthSmallest(TreeNode root, int k) {
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
        if(arr.size()==k) return arr.get(k-1);
        current = current.right;
    }
    return -1;
    }
}
