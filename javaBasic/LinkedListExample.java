package javaBasic;

import java.util.LinkedList;
// LinkedList .add .get .set .remove .addFirst .addLast .removeFirst .removeLast .offer(addLast) .poll(removeFirst)

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList to store String elements
        LinkedList<String> names = new LinkedList<>();

        // Add elements to the LinkedList 
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println("LinkedList after adding elements: " + names);

        //Iterate
        for (String name : names) {
            System.out.println(name);
        }

        // Access an element by index 
        String firstName = names.get(0); // Alice
        System.out.println("First name: " + firstName);

        // Modify an element by index
        names.set(1, "Ben");
        System.out.println("LinkedList after modifying an element: " + names);

        // Remove an element by index
        names.remove(2); // Removes "Charlie"
        System.out.println("LinkedList after removing an element: " + names);

        // Check the size of the LinkedList
        int size = names.size();
        System.out.println("Size of LinkedList: " + size);

        // Check if the LinkedList is empty
        boolean isEmpty = names.isEmpty();
        System.out.println("Is LinkedList empty? " + isEmpty);

        // Add elements at the beginning and end of the LinkedList (Deque operations)
        names.addFirst("Eve"); // Add at the beginning
        names.addLast("David"); // Add at the end
        System.out.println("LinkedList after adding elements at beginning and end: " + names);

        // Remove elements from the beginning and end of the LinkedList (Deque operations)
        String firstRemoved = names.removeFirst(); // Removes "Eve"
        String lastRemoved = names.removeLast(); // Removes "David"
        System.out.println("Removed first element: " + firstRemoved);
        System.out.println("Removed last element: " + lastRemoved);
        System.out.println("LinkedList after removing elements from beginning and end: " + names);

        // Offer and Poll operations (Deque methods)
        names.offer("Grace"); // Add element (similar to addLast)
        names.offer("Hank");
        System.out.println("LinkedList after offer operations: " + names);

        String polledElement = names.poll(); // Remove and return the first element (similar to removeFirst)
        System.out.println("Polled element: " + polledElement);
        System.out.println("LinkedList after poll operation: " + names);
    }
}
