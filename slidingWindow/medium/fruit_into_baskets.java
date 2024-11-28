package slidingWindow.medium;

import java.util.HashMap;

public class fruit_into_baskets {
    public static int totalFruits(Integer[] fruits) {
        // code here
         HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0, maxFruits = 0;

        for (int right = 0; right < fruits.length; right++) {
            // Add current fruit to the basket (map)
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            // Shrink the window if there are more than 2 types of fruits
            while (map.size() > 2) {
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }
                left++; // Move the left boundary
            }

            // Update the maximum fruits collected
            maxFruits = Math.max(maxFruits, right - left + 1);
        }

        return maxFruits;
    }
}
