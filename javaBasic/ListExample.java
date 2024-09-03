package javaBasic;

import java.util.ArrayList;
import java.util.List;
// List .add .get .set .size .remove .contains .clear .isEmpty 

public class ListExample {
    public static void main(String[] args) {
        // Create a List of Strings using ArrayList implementation
        List<String> fruits = new ArrayList<>();

        // Add elements to the List
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Display the List
        System.out.println("List of Fruits: " + fruits);

        // Access elements by index
        String secondFruit = fruits.get(1);
        System.out.println("Second fruit: " + secondFruit);

        // Modify an element at a specific index
        fruits.set(2, "Coconut");
        System.out.println("List after modifying third element: " + fruits);

        // Remove an element by index
        fruits.remove(3);
        System.out.println("List after removing fourth element: " + fruits);

        // Check the size of the List
        int size = fruits.size();
        System.out.println("Size of the List: " + size);

        // Check if the List contains a specific element
        boolean containsBanana = fruits.contains("Banana");
        System.out.println("Does the List contain 'Banana'? " + containsBanana);

        // Iterate over the elements in the List
        System.out.println("Iterating over the List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Clear all elements from the List
        fruits.clear();
        System.out.println("List after clearing all elements: " + fruits);
        System.out.println("Is the List empty after clearing? " + fruits.isEmpty());
    }
}
