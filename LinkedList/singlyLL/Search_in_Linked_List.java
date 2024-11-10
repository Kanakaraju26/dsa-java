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
        System.out.println(searchKey(4, null, 1));
    }
}