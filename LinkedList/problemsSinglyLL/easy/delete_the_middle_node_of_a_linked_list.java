package LinkedList.problemsSinglyLL.easy;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class delete_the_middle_node_of_a_linked_list {
    public static ListNode deleteMiddle(ListNode head) {
        if(head.next==null || head==null) return null;
        ListNode n = head;
        int cnt = 1;
        while(n.next!=null){
            n=n.next;
            cnt++;
        }
        cnt=(cnt/2) + 1;
        ListNode cc = head;
        while(cnt-- > 2){
            cc=cc.next;
        }
        cc.next = cc.next.next;
        return head;
    }
    public static void main(String[] args) {
        System.out.println(deleteMiddle(null));
    }
}
