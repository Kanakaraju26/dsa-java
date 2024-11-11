package LinkedList.problemsDoublyLL;

import java.util.ArrayList;
import java.util.Arrays;

class Node
{
    int data;
    Node next,prev;
    
    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}
public class find_pairs_with_given_sum_in_doubly_linked_list {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    Node left = head;
    Node right = head;

    // Move right to the last node
    while (right.next != null) {
        right = right.next;
    }

    // Use two-pointer technique to find pairs
    while (left != null && right != null && left != right && left.prev != right) {
        int sum = left.data + right.data;
        if (sum == target) {
            // Add the pair to the result list
            arr.add(new ArrayList<>(Arrays.asList(left.data, right.data)));
            left = left.next;
            right = right.prev;
        } else if (sum < target) {
            left = left.next;
        } else {
            right = right.prev;
        }
    
    }
    return arr;
    }
    public static void main(String[] args) {
        System.out.println(findPairsWithGivenSum(0, null));
    }
}
