package LinkedList.problemsSinglyLL.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
public class a_linked_list_of_0s_1s_and_2s_sort_it {
    static Node segregate(Node head) {
        if(head.next==null || head==null) return head;
        // add your code here
        List<Integer> ls = new ArrayList<>();
        Node n = head;
        while(n!=null){
            ls.add(n.data);
            n=n.next;
        }
        Collections.sort(ls);
        Node n1 = head;
        int idx = 0;
        while(n1!=null){
            n1.data = ls.get(idx);
            idx++;
            n1=n1.next;
        }
        return head;
    }
    public static void main(String[] args) {
        System.out.println(segregate(null));
    }
}
