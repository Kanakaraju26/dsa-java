package javaBasic;

import java.util.TreeSet;
//TreeSet .add .contains .remove .size .isEmpty .first .last .subSet .clear

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet to store Integer elements
        TreeSet<Integer> set = new TreeSet<>();

        // Add elements to the TreeSet
        set.add(10);
        set.add(20);
        set.add(15);
        set.add(5);
        set.add(20); // Duplicate element (will not be added)
        System.out.println("TreeSet after adding elements: " + set);

        // Check if an element exists
        boolean containsTen = set.contains(10);
        boolean containsThirty = set.contains(30);
        System.out.println("Does TreeSet contain '10'? " + containsTen);
        System.out.println("Does TreeSet contain '30'? " + containsThirty);

        // Remove an element
        set.remove(15);
        System.out.println("TreeSet after removing '15': " + set);

        // Check the size of the TreeSet
        int size = set.size();
        System.out.println("Size of TreeSet: " + size);

        // Check if the TreeSet is empty
        boolean isEmpty = set.isEmpty();
        System.out.println("Is TreeSet empty? " + isEmpty);

        // Get the first and last elements
        Integer firstElement = set.first();
        Integer lastElement = set.last();
        System.out.println("First element in TreeSet: " + firstElement);
        System.out.println("Last element in TreeSet: " + lastElement);

        // Find elements within a range
        System.out.println("Elements between 5 and 15 (exclusive): " + set.subSet(5, 15));

        // Iterate over the elements in the TreeSet
        System.out.println("Iterating over TreeSet:");
        for (Integer number : set) {
            System.out.println(number);
        }

        // Clear all elements from the TreeSet
        set.clear();
        System.out.println("TreeSet after clearing all elements: " + set);
        System.out.println("Is TreeSet empty after clearing? " + set.isEmpty());
    }
}
