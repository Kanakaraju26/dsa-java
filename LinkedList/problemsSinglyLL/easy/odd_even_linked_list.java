package LinkedList.problemsSinglyLL.easy;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class odd_even_linked_list {
    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even; // Remember the head of even list

        while (even != null && even.next != null) {
            odd.next = even.next; // Link odd node to the next odd node
            odd = odd.next; // Move odd pointer forward

            even.next = odd.next; // Link even node to the next even node
            even = even.next; // Move even pointer forward
        }

        odd.next = evenHead; // Connect the end of the odd list to the start of the even list

        return head;
    }
    public static void main(String[] args) {
        System.out.println(oddEvenList(null));
    }
}
