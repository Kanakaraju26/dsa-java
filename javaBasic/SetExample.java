package javaBasic;

import java.util.HashSet;
import java.util.Set;
//set .add .size .contains .remove .clear .isEmpty .clear

public class SetExample {
    public static void main(String[] args) {
        // Create a Set of Strings using HashSet implementation
        Set<String> fruits = new HashSet<>();

        // Add elements to the Set
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Attempt to add a duplicate element
        fruits.add("Apple");  // This will be ignored as "Apple" is already in the Set

        // Display the Set
        System.out.println("Set of Fruits: " + fruits);

        // Check the size of the Set
        int size = fruits.size();
        System.out.println("Size of the Set: " + size);

        // Check if the Set contains a specific element
        boolean containsBanana = fruits.contains("Banana");
        System.out.println("Does the Set contain 'Banana'? " + containsBanana);

        // Remove an element from the Set
        fruits.remove("Date");
        System.out.println("Set after removing 'Date': " + fruits);

        // Iterate over the elements in the Set
        System.out.println("Iterating over the Set:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Clear all elements from the Set
        fruits.clear();
        System.out.println("Set after clearing all elements: " + fruits);
        System.out.println("Is the Set empty after clearing? " + fruits.isEmpty());
    }
}
