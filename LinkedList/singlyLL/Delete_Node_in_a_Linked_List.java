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
        deleteNode(null);
    }
}
