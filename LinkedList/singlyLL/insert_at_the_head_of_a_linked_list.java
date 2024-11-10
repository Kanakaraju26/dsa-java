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
        System.out.println(insertAtEnd(null, 2));
    }
}