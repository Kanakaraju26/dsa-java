package LinkedList.DoublyLL;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
public class delete_node_in_doubly_linked_list {
    public static Node deleteNode(Node head, int x) {
        if (x == 1) {
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
        return head;
    }

    Node n = head;

    // Traverse to the node at position x
    for (int i = 1; i < x && n != null; i++) {
        n = n.next;
    }

    // Check if n is null (out of bounds)
    if (n == null) return head;

    // Case: node is in the middle
    if (n.prev != null) {
        n.prev.next = n.next;
    }
    if (n.next != null) {
        n.next.prev = n.prev;
    }

    return head;
    }
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Node n1 = deleteNode(null, 2);
    }
}
