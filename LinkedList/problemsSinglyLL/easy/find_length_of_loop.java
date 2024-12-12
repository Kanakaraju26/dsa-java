package LinkedList.problemsSinglyLL.easy;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class find_length_of_loop {
    public static int countNodesinLoop(Node head) {
        // Add your code here.
        if (head == null)
            return 0;
        if (head.next == null)
            return 0;

        Node slow = head;
        Node fast = head;

        // Detect if a cycle exists
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                Node s = slow.next;
                int count = 1;
                while (s != slow) {
                    s = s.next;
                    count++;
                }
                return count;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(countNodesinLoop(null));
    }
}
