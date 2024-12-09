 
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int val;
    Node left;
    Node right;
    
    Node(int val){
        this.val=val;
        left=null;
        right=null;
    }
}

public class binary_tree_representation {

    public static void createTree(Node root0, ArrayList<Integer> v ){
        // Code here
        Queue<Node> queue = new LinkedList<>();
        queue.add(root0);

        int index = 1; // Start with the second element in the array (v[1])
        
        while (index < v.size()) {
            // Get the current parent node from the queue
            Node current = queue.poll();

            // Assign the left child
            if (index < v.size()) {
                current.left = new Node(v.get(index));
                queue.add(current.left);
                index++;
            }

            // Assign the right child
            if (index < v.size()) {
                current.right = new Node(v.get(index));
                queue.add(current.right);
                index++;
            }
        }
    }
}
