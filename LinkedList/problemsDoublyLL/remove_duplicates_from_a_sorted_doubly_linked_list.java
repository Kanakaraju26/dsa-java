package LinkedList.problemsDoublyLL;

class Node {
    int data;
    Node next, prev;

    Node(int x) {
        data = x;
        next = null;
        prev = null;
    }
}

public class remove_duplicates_from_a_sorted_doubly_linked_list {
    static Node removeDuplicates(Node head) {
        if (head == null || head.next == null)
            return head;

        Node current = head;
        int previousValue = head.data;
        while (current.next != null) {
            if (current.next.data == previousValue) {
                // Duplicate found; remove the next node
                Node duplicate = current.next;
                current.next = duplicate.next;
                if (duplicate.next != null) {
                    duplicate.next.prev = current;
                }
            } else {
                // Move to the next node and update previousValue
                current = current.next;
                previousValue = current.data;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(null));
    }
}
