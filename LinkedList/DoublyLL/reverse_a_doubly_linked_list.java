package LinkedList.DoublyLL;

class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
public class reverse_a_doubly_linked_list  {
    public static DLLNode reverseDLL(DLLNode head) {
        if (head == null || head.next == null) return head;

    DLLNode current = head;
    DLLNode prev = null;

    // Traverse and swap next and prev pointers for each node
    while (current != null) {
        prev = current.prev;
        current.prev = current.next;
        current.next = prev;
        current = current.prev;
    }

    // After the loop, prev will be at the new head of the reversed list
    return prev.prev;
    }
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        DLLNode n = reverseDLL(null);
    }
}
