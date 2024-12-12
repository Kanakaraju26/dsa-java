package LinkedList.problemsSinglyLL.easy;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class sort_list {
    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head; // Base case: an empty or single-node list is already sorted
        }
        
        // Step 1: Split the list into two halves
        ListNode mid = getMiddle(head);
        ListNode rightHalf = mid.next;
        mid.next = null; // Break the list into two parts
        
        // Step 2: Recursively sort each half
        ListNode leftSorted = sortList(head);
        ListNode rightSorted = sortList(rightHalf);
        
        // Step 3: Merge the two sorted halves
        return merge(leftSorted, rightSorted);
    }
    
    // Helper function to find the middle of the list
    private static ListNode getMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow; // Slow pointer will be at the middle
    }
    
    // Helper function to merge two sorted lists
    private static ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        
        // Attach the remaining part
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }
        
        return dummy.next;
    }
    public static void main(String[] args) {
        System.out.println(sortList(null));
    }
}
