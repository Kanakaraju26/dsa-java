package BinaryTree.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;
import BinaryTree.*;;
public class bottom_view_of_binary_tree {
    public ArrayList <Integer> bottomView(TreeNode root)
    {
        // Code here
       ArrayList<Integer> result = new ArrayList<>();

        // Map to store the first node at each horizontal distance
        TreeMap<Integer, Integer> topViewMap = new TreeMap<>();
        // Queue for BFS traversal, storing node along with its horizontal distance
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root, 0)); // Start with the root at HD = 0

        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            TreeNode node = current.node;
            int hd = current.hd;

            // If this is the first node at this HD, add it to the map
            topViewMap.put(hd, node.val);

            // Add left and right children to the queue with updated HDs
            if (node.left != null) queue.offer(new Pair(node.left, hd - 1));
            if (node.right != null) queue.offer(new Pair(node.right, hd + 1));
        }

        // Add the top view nodes to the result list in order of HD
        for (int value : topViewMap.values()) {
            result.add(value);
        }

        return result;
    }


static class Pair {
    TreeNode node;
    int hd;

    Pair(TreeNode node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}
}
