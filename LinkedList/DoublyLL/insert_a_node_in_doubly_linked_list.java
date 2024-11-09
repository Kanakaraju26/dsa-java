package LinkedList.DoublyLL;

class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
public class insert_a_node_in_doubly_linked_list {
    static Node addNode(Node head, int p, int x) {
        // Your code here\
         Node cur=new Node(x);
        if(head==null){
            return null;
        }
        Node temp=head;
        while(temp.next!=null&&p>0){
            temp=temp.next;
            p--;
        }
        if(temp.next==null){
            cur.prev=temp;
            temp.next=cur;
            return head;
        }
        cur.next=temp.next;
        cur.prev=temp;
        temp.next.prev=cur;
        temp.next=cur;
        return head;
    }
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Node n1 = addNode(null, 3, 5);
    }
}
