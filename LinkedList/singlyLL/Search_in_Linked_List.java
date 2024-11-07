package LinkedList.singlyLL;

class Node {
    int data;
     Node next;
     Node(int d)  { data = d;  next = null; }
 }

public class Search_in_Linked_List {
    static boolean searchKey(int n, Node head, int key) {
        // Code here
        while(head.next != null){
            if(head.data==key) return true;
            head = head.next;
        }
        return false;
    }
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        System.out.println(searchKey(4, n1, 8));
    }
}