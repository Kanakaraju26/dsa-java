package javaBasic;

import java.util.Vector;
//Vector .add .get .set .remove .contains .size .clear .isEmpty

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector of Strings
        Vector<String> vector = new Vector<>();

        // Add elements to the Vector
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        vector.add("Date");
        vector.add("Elderberry");

        // Display the Vector
        System.out.println("Vector: " + vector);

        // Access elements in the Vector using index
        String firstElement = vector.get(0);
        System.out.println("First Element: " + firstElement);

        // Update an element in the Vector
        vector.set(2, "Cranberry");
        System.out.println("Vector after updating 3rd element: " + vector);

        // Remove an element from the Vector
        vector.remove("Date");
        System.out.println("Vector after removing 'Date': " + vector);

        // Check if the Vector contains a specific element
        boolean containsBanana = vector.contains("Banana");
        System.out.println("Does the Vector contain 'Banana'? " + containsBanana);

        // Get the size of the Vector
        int size = vector.size();
        System.out.println("Size of the Vector: " + size);

        // Iterate over the elements in the Vector
        System.out.println("Iterating over the Vector:");
        for (String fruit : vector) {
            System.out.println(fruit);
        }

        // Clear all elements from the Vector
        vector.clear();
        System.out.println("Vector after clearing all elements: " + vector);
        System.out.println("Is the Vector empty after clearing? " + vector.isEmpty());
    }
}

