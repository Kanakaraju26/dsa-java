package LinkedList.singlyLL;
    
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

public class insert_at_the_head_of_a_linked_list {
    static Node insertAtEnd(Node head, int x) {
        // code here
        if (head == null) {
            return new Node(x); 
        }
        Node c = head;
        while(c.next != null){
            c = c.next;
        }
        Node nn = new Node(x);
        c.next = nn;
        nn.next = null;
        return head;
    }
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        @SuppressWarnings("unused")
        Node n = insertAtEnd(n1, 7);
    }
}