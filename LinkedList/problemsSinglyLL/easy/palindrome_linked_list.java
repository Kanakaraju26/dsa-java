package LinkedList.problemsSinglyLL;


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class palindrome_linked_list {
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
               return true;
           }
           
           // Step 1: Find the middle of the list
           ListNode slow = head;
           ListNode fast = head;
           
           while (fast != null && fast.next != null) {
               slow = slow.next;
               fast = fast.next.next;
           }
           
           ListNode secondHalf = reverseList(slow);
           ListNode firstHalf = head;
           
           ListNode temp = secondHalf;
           while (temp != null) {
               if (firstHalf.val != temp.val) {
                   System.gc();
                   return false;
               }
               firstHalf = firstHalf.next;
               temp = temp.next;
           }
           System.gc();
           
           return true;
       }
       
       private static ListNode reverseList(ListNode head) {
           ListNode prev = null;
           ListNode current = head;
           
           while (current != null) {
               ListNode next = current.next;
               current.next = prev;
               prev = current;
               current = next;
           }
           
           return prev;
       }
    public static void main(String[] args) {
        System.out.println(isPalindrome(null));
    }
}
