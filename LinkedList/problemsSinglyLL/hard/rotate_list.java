package LinkedList.problemsSinglyLL.hard;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class rotate_list {
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
           return head;
       }

       // Step 1: Calculate the length of the list and get the last node
       ListNode last = head;
       int length = 1;
       while (last.next != null) {
           last = last.next;
           length++;
       }

       // Step 2: Compute effective rotations needed
       k = k % length;
       if (k == 0) {
           return head; // No rotation needed
       }

       // Step 3: Find the new end of the list (length - k - 1)th node
       int stepsToNewEnd = length - k;
       ListNode newEnd = head;
       for (int i = 1; i < stepsToNewEnd; i++) {
           newEnd = newEnd.next;
       }

       // Step 4: Set up new head and break the list
       ListNode newHead = newEnd.next;
       newEnd.next = null;
       last.next = head; 
       
       return newHead;
   }
   public static void main(String[] args) {
    rotateRight(null, 2);
   }
}
