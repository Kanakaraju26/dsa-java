package javaBasic;

import java.util.LinkedHashSet;
//LinkedHashSet .add .contains .remove .size .isEmpty .clear

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Create a LinkedHashSet to store String elements
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // Add elements to the LinkedHashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Banana"); // Duplicate element (will not be added)
        System.out.println("LinkedHashSet after adding elements: " + set);

        // Check if an element exists
        boolean containsApple = set.contains("Apple");
        boolean containsOrange = set.contains("Orange");
        System.out.println("Does LinkedHashSet contain 'Apple'? " + containsApple);
        System.out.println("Does LinkedHashSet contain 'Orange'? " + containsOrange);

        // Remove an element
        set.remove("Cherry");
        System.out.println("LinkedHashSet after removing 'Cherry': " + set);

        // Check the size of the LinkedHashSet
        int size = set.size();
        System.out.println("Size of LinkedHashSet: " + size);

        // Check if the LinkedHashSet is empty
        boolean isEmpty = set.isEmpty();
        System.out.println("Is LinkedHashSet empty? " + isEmpty);

        // Iterate over the elements in the LinkedHashSet
        System.out.println("Iterating over LinkedHashSet:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Clear all elements from the LinkedHashSet
        set.clear();
        System.out.println("LinkedHashSet after clearing all elements: " + set);
        System.out.println("Is LinkedHashSet empty after clearing? " + set.isEmpty());
    }
}
