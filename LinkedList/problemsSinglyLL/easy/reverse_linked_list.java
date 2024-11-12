package LinkedList.problemsSinglyLL;

class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class reverse_linked_list {
    public static ListNode reverseList(ListNode head) {
        if(head==null) return null;
        ListNode cur = head;
        ListNode prev = null;
        
        while(cur!=null){
            ListNode n = cur.next;
            cur.next = prev; 
            prev=cur;
            cur = n;
        }
        return prev;
    }
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        ListNode n = reverseList(null);
    }
}
