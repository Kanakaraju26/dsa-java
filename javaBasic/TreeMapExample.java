package javaBasic;

import java.util.TreeMap;
import java.util.Map;
//TreeMap .put .get .containsKey .remove .firstKey .lastKey .subMap .size .isEmpty Map.Entry<Integer, String> entry : map.entrySet() .keySet .values

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap to store Integer keys and String values
        TreeMap<Integer, String> map = new TreeMap<>();

        // Add key-value pairs to the TreeMap
        map.put(3, "Cherry");
        map.put(1, "Apple");
        map.put(4, "Date");
        map.put(2, "Banana");
        map.put(5, "Elderberry");
        System.out.println("TreeMap after adding elements: " + map);

        // Retrieve a value based on a key
        String value = map.get(2);
        System.out.println("Value associated with key '2': " + value);

        // Check if a key exists
        boolean containsKey1 = map.containsKey(1);
        boolean containsKey6 = map.containsKey(6);
        System.out.println("Does TreeMap contain key '1'? " + containsKey1);
        System.out.println("Does TreeMap contain key '6'? " + containsKey6);

        // Remove a key-value pair
        map.remove(4);
        System.out.println("TreeMap after removing key '4': " + map);

        // Retrieve the first and last keys
        Integer firstKey = map.firstKey();
        Integer lastKey = map.lastKey();
        System.out.println("First key: " + firstKey);
        System.out.println("Last key: " + lastKey);

        // Retrieve a subMap
        System.out.println("SubMap from key 2 to key 5: " + map.subMap(2, true, 5, true));

        // Check the size of the TreeMap
        int size = map.size();
        System.out.println("Size of TreeMap: " + size);

        // Check if the TreeMap is empty
        boolean isEmpty = map.isEmpty();
        System.out.println("Is TreeMap empty? " + isEmpty);

        // Iterate over the key-value pairs in the TreeMap
        System.out.println("Iterating over TreeMap:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Retrieve all keys and values
        System.out.println("Keys in TreeMap: " + map.keySet());
        System.out.println("Values in TreeMap: " + map.values());

        // Clear all key-value pairs from the TreeMap
        map.clear();
        System.out.println("TreeMap after clearing all elements: " + map);
        System.out.println("Is TreeMap empty after clearing? " + map.isEmpty());
    }
}
