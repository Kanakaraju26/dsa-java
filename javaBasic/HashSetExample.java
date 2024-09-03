package javaBasic;

import java.util.HashSet;
//HashSet .add .contains .remove .size .isEmpty .clear

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet to store String elements
        HashSet<String> set = new HashSet<>();

        // Add elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Banana"); // Duplicate element (will not be added)
        System.out.println("HashSet after adding elements: " + set);

        // Check if an element exists
        boolean containsApple = set.contains("Apple");
        boolean containsOrange = set.contains("Orange");
        System.out.println("Does HashSet contain 'Apple'? " + containsApple);
        System.out.println("Does HashSet contain 'Orange'? " + containsOrange);

        // Remove an element
        set.remove("Cherry");
        System.out.println("HashSet after removing 'Cherry': " + set);

        // Check the size of the HashSet
        int size = set.size();
        System.out.println("Size of HashSet: " + size);

        // Check if the HashSet is empty
        boolean isEmpty = set.isEmpty();
        System.out.println("Is HashSet empty? " + isEmpty);

        // Iterate over the elements in the HashSet
        System.out.println("Iterating over HashSet:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Clear all elements from the HashSet
        set.clear();
        System.out.println("HashSet after clearing all elements: " + set);
        System.out.println("Is HashSet empty after clearing? " + set.isEmpty());
    }
}
