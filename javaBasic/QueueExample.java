package javaBasic;

import java.util.LinkedList;
import java.util.Queue;
//Queue .add .peek .poll .size .clear .isEmpty

public class QueueExample {
    public static void main(String[] args) {
        // Create a Queue of Strings using LinkedList implementation
        Queue<String> queue = new LinkedList<>();

        // Add elements to the Queue
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");
        queue.add("Date");
        queue.add("Elderberry");

        // Display the Queue
        System.out.println("Queue: " + queue);

        // Access the head of the Queue without removing it
        String head = queue.peek();
        System.out.println("Head of the Queue: " + head);

        // Remove elements from the Queue
        String removedElement = queue.poll();
        System.out.println("Removed Element: " + removedElement);
        System.out.println("Queue after removal: " + queue);

        // Check the size of the Queue
        int size = queue.size();
        System.out.println("Size of the Queue: " + size);

        // Iterate over the elements in the Queue
        System.out.println("Iterating over the Queue:");
        for (String fruit : queue) {
            System.out.println(fruit);
        }

        // Clear all elements from the Queue
        queue.clear();
        System.out.println("Queue after clearing all elements: " + queue);
        System.out.println("Is the Queue empty after clearing? " + queue.isEmpty());
    }
}

