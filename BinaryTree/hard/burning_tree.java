import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
public class burning_tree {
    public static int minTime(Node root, int target) {
       Map<Node, Node> parentMap = new HashMap<>();
        Node targetNode = buildParentMap(root, null, target, parentMap);

        // Step 2: Perform BFS to calculate minimum burn time
        return bfsToBurnTree(targetNode, parentMap);
    }

    // Helper method to build parent pointers and locate the target node
    private static Node buildParentMap(Node node, Node parent, int target, Map<Node, Node> parentMap) {
        if (node == null) return null;

        // Add parent mapping
        if (parent != null) {
            parentMap.put(node, parent);
        }

        // If the current node is the target, return it
        if (node.data == target) {
            return node;
        }

        // Recur for left and right subtrees
        Node left = buildParentMap(node.left, node, target, parentMap);
        if (left != null) return left;

        return buildParentMap(node.right, node, target, parentMap);
    }

    // BFS to calculate minimum time to burn the tree
    private static int bfsToBurnTree(Node targetNode, Map<Node, Node> parentMap) {
        Queue<Node> queue = new LinkedList<>();
        Set<Node> visited = new HashSet<>();
        
        queue.add(targetNode);
        visited.add(targetNode);

        int time = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean burned = false;

            for (int i = 0; i < size; i++) {
                Node current = queue.poll();

                // Process left child
                if (current.left != null && !visited.contains(current.left)) {
                    queue.add(current.left);
                    visited.add(current.left);
                    burned = true;
                }

                // Process right child
                if (current.right != null && !visited.contains(current.right)) {
                    queue.add(current.right);
                    visited.add(current.right);
                    burned = true;
                }

                // Process parent
                Node parent = parentMap.get(current);
                if (parent != null && !visited.contains(parent)) {
                    queue.add(parent);
                    visited.add(parent);
                    burned = true;
                }
            }

            // Increment time only if we burned new nodes in this iteration
            if (burned) {
                time++;
            }
        }

        return time;
    }
}
