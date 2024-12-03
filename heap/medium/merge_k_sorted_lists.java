package heap.medium;

import java.util.PriorityQueue;
class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
    
public class merge_k_sorted_lists {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(ListNode i:lists){
            while(i!=null){
            minHeap.add(i.val);
            i=i.next;
            }
        }
        if(minHeap.size()==0 ) return null;
        ListNode n = new ListNode();
        ListNode nn = n;
        while(!minHeap.isEmpty()){
            nn.next = new ListNode(minHeap.poll());
            nn=nn.next;
        }
        return n.next;
    }
}
