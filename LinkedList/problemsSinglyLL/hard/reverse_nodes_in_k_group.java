package LinkedList.problemsSinglyLL.hard;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class reverse_nodes_in_k_group {
    static ListNode reverse(ListNode head, int k) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        while (k > 0) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            k--;
        }
        return prev;
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        ListNode temp = head;
        int count = 0;
        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }

        if (count == k) {
            ListNode newHead = reverse(head, k);
            head.next = reverseKGroup(temp, k);
            return newHead;
        }

        return head;
    }
    public static void main(String[] args) {
        reverse(null, 0);
    }
}
