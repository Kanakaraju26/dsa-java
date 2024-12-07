package Greedy.medium;

import java.util.Arrays;

public class minimum_platforms {
    static int findPlatform(int arr[], int dep[]) {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);

        int platforms = 0; // Current platforms in use
        int maxPlatforms = 0; // Maximum platforms needed

        int i = 0, j = 0;
        int n = arr.length;

        while (i < n && j < n) {
            // If a train arrives before or when the current train departs
            if (arr[i] <= dep[j]) {
                platforms++; // One more platform needed
                i++; // Move to next arrival
            } else {
                platforms--; // Train departed, free a platform
                j++; // Move to next departure
            }
            // Update the maximum platforms required
            maxPlatforms = Math.max(maxPlatforms, platforms);
        }

        return maxPlatforms;
    }
}
