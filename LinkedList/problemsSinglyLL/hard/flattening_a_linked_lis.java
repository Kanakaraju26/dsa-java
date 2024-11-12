package LinkedList.problemsSinglyLL.hard;

class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
public class flattening_a_linked_lis {
    static Node mergeTwoLists(Node a, Node b) {
        if (a == null) return b;
        if (b == null) return a;

        Node result;
        if (a.data < b.data) {
            result = a;
            result.bottom = mergeTwoLists(a.bottom, b);
        } else {
            result = b;
            result.bottom = mergeTwoLists(a, b.bottom);
        }
        result.next = null; // Ensure 'next' is not used in the flattened list
        return result;
    }

    // Function to flatten the linked list
    public static Node flatten(Node root) {
        if (root == null || root.next == null) {
            return root;
        }

        // Recursively flatten the list starting from the next node
        root.next = flatten(root.next);

        // Merge current list with the flattened next list
        root = mergeTwoLists(root, root.next);

        return root;
    }
    public static void main(String[] args) {
        mergeTwoLists(null, null);
    }
}
