package LinkedList.singlyLL;

    
class Node {
    int data;
    Node next;

    Node() { data = 0; }
    Node(int d) { data = d; }  
}

public class Array_to_Linked_List {
    static Node constructLL(int arr[]) {
        // code here
        Node h = new Node(arr[0]);
        Node c = h;
        for(int i=1;i<arr.length;i++){
            Node nn = new Node(arr[i]);
            c.next = nn;
            c = nn;
        }
        return h;
    }
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Node n = constructLL(new int[] {2,3,4,56,7,1,1});
    }
}
