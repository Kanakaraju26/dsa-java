package LinkedList.problemsSinglyLL;

class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
public class add_1_to_a_number_represented_as_linked_list {
    public static Node addOne(Node head) {
        // code here.
        
         head = reverse(head);

        // Step 2: Add 1 to the head of the reversed list and handle carry
        Node current = head;
        int carry = 1;

        while (current != null) {
            int sum = current.data + carry;
            current.data = sum % 10;
            carry = sum / 10;

            // If no carry, we can stop here
            if (carry == 0) break;

            // Move to the next node
            if (current.next == null && carry > 0) {
                current.next = new Node(carry); // add a new node if carry exists after the last node
                break;
            }
            current = current.next;
        }

        // Step 3: Reverse the list back to the original order
        return reverse(head);
    }

    private static Node reverse(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    public static void main(String[] args) {
        System.out.println(addOne(null));
    }
}
