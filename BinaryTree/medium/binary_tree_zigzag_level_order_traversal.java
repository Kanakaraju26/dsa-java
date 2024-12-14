package BinaryTree.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import BinaryTree.TreeNode;
public class binary_tree_zigzag_level_order_traversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean leftToRight = true;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            LinkedList<Integer> level = new LinkedList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();

                if (leftToRight) {
                    level.addLast(current.val); // Add to the end for left-to-right
                } else {
                    level.addFirst(current.val); // Add to the beginning for right-to-left
                }

                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }

            result.add(level);
            leftToRight = !leftToRight; // Toggle direction
        }

        return result;
    }
}
