package LinkedList.singlyLL;

class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}
public class Count_Linked_List_Nodes
{
    public static int getCount(Node head) {
        // code here
        int count = 1;
        while(head.next!=null){
            count++;
            head = head.next;
        }
        return count;
    }
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        System.out.println(getCount(n1));
    }
}
