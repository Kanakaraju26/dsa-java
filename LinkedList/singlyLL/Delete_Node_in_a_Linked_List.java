package LinkedList.singlyLL;


class Node {
        int val;
        Node next;
        Node(int x) { val = x; }
}

public class Delete_Node_in_a_Linked_List {
    public static void deleteNode(Node node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        deleteNode(n1);
    }
}
