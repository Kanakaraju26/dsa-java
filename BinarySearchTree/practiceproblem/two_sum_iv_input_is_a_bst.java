package BinarySearchTree.practiceproblem;

import java.util.ArrayList;
import BinarySearchTree.TreeNode;
public class two_sum_iv_input_is_a_bst {
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        inorderTraversal(root, list);
         int left = 0, right = list.size() - 1;
        while (left < right) {
            int sum = list.get(left) + list.get(right);
            if (sum == k) {
                return true;
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
    private void inorderTraversal(TreeNode node, ArrayList<Integer> list) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left, list);
        list.add(node.val);
        inorderTraversal(node.right, list);
    }
}
