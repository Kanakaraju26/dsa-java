package Greedy.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class fractional_knapsack {
    static class Item {
        int value, weight;
        Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }
    }

    // Comparator to sort items by value-to-weight ratio
    static class ItemComparator implements Comparator<Item> {
        @Override
        public int compare(Item a, Item b) {
            double r1 = (double) a.value / a.weight;
            double r2 = (double) b.value / b.weight;
            return Double.compare(r2, r1); // Descending order
        }
    }

    // Function to get the maximum total value in the knapsack
    double fractionalKnapsack(List<Integer> val, List<Integer> wt, int capacity) {
        // Convert input lists into an array of items
        int n = val.size();
        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            items[i] = new Item(val.get(i), wt.get(i));
        }

        // Sort items by value-to-weight ratio
        Arrays.sort(items, new ItemComparator());

        double totalValue = 0.0; // Maximum value in the knapsack
        int remainingCapacity = capacity;

        for (Item item : items) {
            if (remainingCapacity == 0) break; // Knapsack is full

            if (item.weight <= remainingCapacity) {
                // Take the whole item
                totalValue += item.value;
                remainingCapacity -= item.weight;
            } else {
                // Take a fraction of the item
                totalValue += item.value * ((double) remainingCapacity / item.weight);
                remainingCapacity = 0; // Knapsack is full
            }
        }
        return totalValue; // Return maximum value
    }
}
