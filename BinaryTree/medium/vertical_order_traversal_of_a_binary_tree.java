package BinaryTree.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import BinaryTree.TreeNode;
public class vertical_order_traversal_of_a_binary_tree {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> collection = new ArrayList<>();

        TreeMap<Integer, Map<Integer, List<Integer>>> treeMap = new TreeMap<>();

        inorderTraversal(root, treeMap, 0, 0);

        for (var colEntry : treeMap.entrySet()) {

            List<Integer> list = new ArrayList<>();

            for (var rowValues : colEntry.getValue().values()) {

                Collections.sort(rowValues);
                list.addAll(rowValues);
            }

            collection.add(list);
        }

        return collection;
    }

    @SuppressWarnings("unused")
    private static void inorderTraversal(TreeNode node, TreeMap<Integer, Map<Integer, List<Integer>>> treeMap,
            int column,
            int row) {

        if (node == null) {
            return;
        }

        treeMap.computeIfAbsent(column, k -> new TreeMap<>()).computeIfAbsent(row, k -> new ArrayList<>())
                .add(node.val);

        inorderTraversal(node.left, treeMap, column - 1, row + 1);
        inorderTraversal(node.right, treeMap, column + 1, row + 1);
    }
}
