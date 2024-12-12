package LinkedList.problemsSinglyLL.easy;

class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class middle_of_the_linked_list {
    public static ListNode middleNode(ListNode head) {
        if(head==null) return null;
        ListNode s = head;
        ListNode f = head;
        
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        ListNode n = middleNode(null);
    }
}
