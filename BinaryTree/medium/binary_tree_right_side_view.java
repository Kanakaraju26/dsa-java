package BinaryTree.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import BinaryTree.*;
public class binary_tree_right_side_view {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            // Traverse the current level
            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();

                // If it's the last node in the current level, add it to the result
                if (i == levelSize - 1) {
                    result.add(current.val);
                }

                // Add left and right children to the queue
                if (current.left != null) queue.offer(current.left);
                if (current.right != null) queue.offer(current.right);
            }
        }

        return result;
    }
}
