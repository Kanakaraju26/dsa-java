package binarysearch.bsonans;

public class capacity_to_ship_packages_within_d_days {
    public static int shipWithinDays(int[] weights, int days) {
        int left = 0, right = 0;

        // Initialize left as the max weight and right as the sum of weights
        for (int weight : weights) {
            left = Math.max(left, weight);
            right += weight;
        }

        // Binary search for the minimum ship capacity
        while (left < right) {
            int mid = left + (right - left) / 2;

            // Check if we can ship within days using this mid capacity
            if (canShipInDays(weights, days, mid)) {
                right = mid; // Try for a smaller capacity
            } else {
                left = mid + 1; // Increase the capacity
            }
        }

        return left; // The smallest valid capacity
    }

    // Helper function to check if we can ship in 'days' with capacity 'cap'
    private static boolean canShipInDays(int[] weights, int days, int cap) {
        int dayCount = 1;
        int currentLoad = 0;

        for (int weight : weights) {
            currentLoad += weight;
            if (currentLoad > cap) { // Exceeds current capacity
                dayCount++;
                currentLoad = weight; // Start a new day with current package
            }
            if (dayCount > days) return false; // Too many days needed
        }

        return true; // Can be done within 'days'
    }
    public static void main(String[] args) {
        System.out.println(shipWithinDays(new int[] {1,3,5,8}, 2));
    }
}
