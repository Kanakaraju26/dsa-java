package javaBasic;

import java.util.ArrayDeque;
//ArrayDeque .addLast .addFirst .peekFrist .peekLast .removeFirst .removeLast .clear   .isEmpty

public class ArrayDequeExample {
    public static void main(String[] args) {
        // Create an ArrayDeque of Integers
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // Add elements to the ArrayDeque
        deque.addLast(10); // Adding to the end (queue behavior)
        deque.addLast(20);
        deque.addFirst(5); // Adding to the front (stack behavior)
        deque.addLast(30);
        deque.addFirst(1);

        // Display the ArrayDeque
        System.out.println("ArrayDeque: " + deque);

        // Peek at the first and last elements
        int firstElement = deque.peekFirst();
        int lastElement = deque.peekLast();
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);

        // Remove elements from the ArrayDeque
        int removedFirst = deque.removeFirst(); // Removes from the front
        int removedLast = deque.removeLast();   // Removes from the end
        System.out.println("Removed First Element: " + removedFirst);
        System.out.println("Removed Last Element: " + removedLast);

        // Display the ArrayDeque after removal
        System.out.println("ArrayDeque after removal: " + deque);

        // Add more elements
        deque.addFirst(100);
        deque.addLast(200);
        System.out.println("ArrayDeque after adding more elements: " + deque);

        // Iterate over the ArrayDeque
        System.out.println("Iterating over the ArrayDeque:");
        for (Integer element : deque) {
            System.out.println(element);
        }

        // Clear all elements from the ArrayDeque
        deque.clear();
        System.out.println("ArrayDeque after clearing: " + deque);
        System.out.println("Is the ArrayDeque empty? " + deque.isEmpty());
    }
}

