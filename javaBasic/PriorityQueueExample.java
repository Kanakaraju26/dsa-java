package javaBasic;

import java.util.PriorityQueue;
//PriorityQueue .add .peek .poll .remove .clear .isEmpty .addAll

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue of Integers
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);
        pq.add(50);

        // Display the PriorityQueue (it doesn't guarantee sorted order when printing)
        System.out.println("PriorityQueue: " + pq);

        // Peek at the head of the PriorityQueue
        int head = pq.peek();
        System.out.println("Head of the PriorityQueue: " + head);

        // Poll elements from the PriorityQueue (removes and returns the head of the queue)
        int polledElement = pq.poll();
        System.out.println("Polled Element: " + polledElement);
        System.out.println("PriorityQueue after poll: " + pq);

        // Add another element to the PriorityQueue
        pq.add(15);
        System.out.println("PriorityQueue after adding 15: " + pq);

        // Iterate over the PriorityQueue
        System.out.println("Iterating over the PriorityQueue:");
        for (Integer element : pq) {
            System.out.println(element);
        }

        // Remove a specific element
        pq.remove(30);
        System.out.println("PriorityQueue after removing 30: " + pq);

        // Clear the PriorityQueue
        pq.clear();
        System.out.println("PriorityQueue after clearing: " + pq);
        System.out.println("Is the PriorityQueue empty? " + pq.isEmpty());

        //.addAll
        //pq.addAll(map.entrySet());
    }
}
