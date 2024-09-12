package javaBasic;

import java.util.HashMap;
import java.util.Map;
//HashMap .put .get .containsKey .remove .size .isEmpty Map.Entry<Integer, String> entry : map.entrySet() .getKey .getValue .keySet .values .getOrDefault

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap to store Integer keys and String values
        HashMap<Integer, String> map = new HashMap<>();

        // Add key-value pairs to the HashMap
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Date");
        map.put(2, "Blueberry"); // Duplicate key (value will be updated)
        System.out.println("HashMap after adding elements: " + map);

        // Retrieve a value based on a key
        String value = map.get(2);
        System.out.println("Value associated with key '2': " + value);

        // Check if a key exists
        boolean containsKey1 = map.containsKey(1);
        boolean containsKey5 = map.containsKey(5);
        System.out.println("Does HashMap contain key '1'? " + containsKey1);
        System.out.println("Does HashMap contain key '5'? " + containsKey5);

        // Remove a key-value pair
        map.remove(3);
        System.out.println("HashMap after removing key '3': " + map);

        // Check the size of the HashMap
        int size = map.size();
        System.out.println("Size of HashMap: " + size);

        // Check if the HashMap is empty
        boolean isEmpty = map.isEmpty();
        System.out.println("Is HashMap empty? " + isEmpty);

        // Iterate over the key-value pairs in the HashMap
        System.out.println("Iterating over HashMap:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Retrieve all keys and values
        System.out.println("Keys in HashMap: " + map.keySet());
        System.out.println("Values in HashMap: " + map.values());

        // Clear all key-value pairs from the HashMap
        map.clear();
        System.out.println("HashMap after clearing all elements: " + map);
        System.out.println("Is HashMap empty after clearing? " + map.isEmpty());
    }
}

