package LinkedList.DoublyLL;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int x) {
        data = x;
        next = null;
        prev = null;
    }
}
public class introduction_to_doubly_linked_list {
    static Node constructDLL(int arr[]) {
        // Code here
        Node n1 = new Node(arr[0]);
        n1.prev = null;
        Node h = n1;
        for(int i=1;i<arr.length;i++){
            Node nn = new Node(arr[i]);
            h.next = nn;
            nn.prev = h;
            h = h.next;
        }
        return n1;
    }
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Node n = constructDLL(new int[] {2,4,5,7,8,0});
    }
}
