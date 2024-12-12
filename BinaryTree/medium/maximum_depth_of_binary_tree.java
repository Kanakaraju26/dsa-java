package BinaryTree.medium;

import java.util.*;
import BinaryTree.TreeNode;
public class maximum_depth_of_binary_tree {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;

        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // Number of nodes at the current level
            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
            depth++; // Increment depth after processing one level
        }

        return depth;
    }
}