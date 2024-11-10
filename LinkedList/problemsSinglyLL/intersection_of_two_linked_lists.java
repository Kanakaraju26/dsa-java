package LinkedList.problemsSinglyLL;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class intersection_of_two_linked_lists {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode n1 = headA;
        ListNode n2 = headB;
        
        
    while (n1 != n2) {
        // Move n1 to headB if it reaches the end of List A; otherwise, move to the next node.
        n1 = (n1 == null) ? headB : n1.next;
        
        // Move n2 to headA if it reaches the end of List B; otherwise, move to the next node.
        n2 = (n2 == null) ? headA : n2.next;
    }
        return n1;
    }
    public static void main(String[] args) {
        System.out.println(getIntersectionNode(null, null));
    }
}
