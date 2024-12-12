package LinkedList.problemsSinglyLL.easy;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class remove_nth_node_from_end_of_list {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node to handle edge cases, like removing the head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode first = dummy;
        ListNode second = dummy;

        // Move the `first` pointer n + 1 steps ahead
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        // Move both pointers until `first` reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Remove the nth node from the end
        second.next = second.next.next;

        return dummy.next;
    }

    public static void main(String[] args) {
        System.out.println(removeNthFromEnd(null, 2));
    }
}
