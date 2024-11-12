package LinkedList.problemsSinglyLL;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class add_two_numbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // Dummy head to build the resulting list
        ListNode p = l1, q = l2, current = dummyHead;
        int carry = 0;

        // Traverse both lists
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = x + y + carry;

            carry = sum / 10;  // Update carry for next addition
            current.next = new ListNode(sum % 10); // Create new node with the current digit
            current = current.next;

            // Move to the next nodes in l1 and l2
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }

        // If there is still a carry left, add a new node
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummyHead.next; 
    }
    public static void main(String[] args) {
        System.out.println(addTwoNumbers(null, null));
    }
}
