package LinkedList.problemsDoublyLL;

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
public class delete_all_occurrences_of_a_given_key_in_a_doubly_linked_lis {
    static Node deleteAllOccurOfX(Node head, int x) {
        // Write your code here
        if(head==null) return head;
        while(head != null && head.data==x){
            head=head.next;
        }
        Node c = head;
        while(c!=null){
            if(c.data==x){
                Node nn = c.prev;
                nn.next = c.next;
                c.next = nn;
            }
            c=c.next;
            
        }
        return head;
        
    }
    public static void main(String[] args) {
        System.out.println(deleteAllOccurOfX(null, 2));
    }
}
