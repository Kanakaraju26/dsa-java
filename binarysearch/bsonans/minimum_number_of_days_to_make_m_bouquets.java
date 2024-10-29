package binarysearch.bsonans;

public class minimum_number_of_days_to_make_m_bouquets{
    public static int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;

        // If there are not enough flowers to form m bouquets, return -1
        if (m * k > n) return -1;

        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;
        
        // Determine the range of days
        for (int day : bloomDay) {
            left = Math.min(left, day);
            right = Math.max(right, day);
        }

        int result = -1;
        
        // Binary search for the minimum days
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if we can make m bouquets by mid days
            if (canMakeBouquets(bloomDay, m, k, mid)) {
                result = mid;
                right = mid - 1; // Try for fewer days
            } else {
                left = mid + 1; // Increase days
            }
        }
        return result;
    }

    // Helper function to check if we can make m bouquets in the given days
    private static boolean canMakeBouquets(int[] bloomDay, int m, int k, int days) {
        int bouquets = 0;
        int flowers = 0;

        for (int day : bloomDay) {
            // Check if flower blooms within 'days'
            if (day <= days) {
                flowers++;
                // If we have enough flowers for one bouquet
                if (flowers == k) {
                    bouquets++;
                    flowers = 0; // Reset flowers for the next bouquet
                }
            } else {
                flowers = 0; // Reset flowers if this flower blooms after 'days'
            }
            // If we've made enough bouquets, return true
            if (bouquets >= m) {
                return true;
            }
        }
        return false; // Not enough bouquets could be made
    }
    public static void main(String[] args) {
        System.out.println(minDays(new int[]{2,3,4,5,6,7,9}, 2, 3));
    }
}