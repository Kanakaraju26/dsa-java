package javaBasic;

import java.util.*;
// ArrayList .add .get .set .size .isEmpty .contains

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store String elements
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList  (.add)
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("ArrayList after adding elements: " + fruits);

        // Access an element by index  
        String firstFruit = fruits.get(0); // Apple
        System.out.println("First fruit: " + firstFruit);

        // Modify an element by index   
        fruits.set(1, "Blueberry");
        System.out.println("ArrayList after modifying an element: " + fruits);

        // Remove an element by index   
        fruits.remove(2); // Removes "Cherry"
        System.out.println("ArrayList after removing an element: " + fruits);

        // Check the size of the ArrayList 
        int size = fruits.size();
        System.out.println("Size of ArrayList: " + size);

        // Check if the ArrayList is empty  
        boolean isEmpty = fruits.isEmpty();
        System.out.println("Is ArrayList empty? " + isEmpty);

        // Iterate over the elements in the ArrayList
        System.out.println("Iterating over ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Check if a specific element is present
        boolean containsApple = fruits.contains("Apple");
        System.out.println("Does ArrayList contain 'Apple'? " + containsApple);
    }
}
