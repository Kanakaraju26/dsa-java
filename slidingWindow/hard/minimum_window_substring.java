package slidingWindow.hard;

import java.util.HashMap;

public class minimum_window_substring {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) {
            return "";
        }

        // HashMap to store the frequency of characters in t
        HashMap<Character, Integer> required = new HashMap<>();
        for (char c : t.toCharArray()) {
            required.put(c, required.getOrDefault(c, 0) + 1);
        }

        // Variables to track the number of unique characters matched
        int requiredCount = required.size();
        int matchedCount = 0;

        // HashMap to store the frequency of characters in the current window
        HashMap<Character, Integer> windowCounts = new HashMap<>();

        // Sliding window pointers and result variables
        int start = 0, end = 0;
        int minLength = Integer.MAX_VALUE;
        int minStart = 0;

        while (end < s.length()) {
            // Expand the window by adding the character at `end`
            char endChar = s.charAt(end);
            windowCounts.put(endChar, windowCounts.getOrDefault(endChar, 0) + 1);

            // Check if the current character satisfies the requirement
            if (required.containsKey(endChar) && windowCounts.get(endChar).equals(required.get(endChar))) {
                matchedCount++;
            }

            // Contract the window until it is no longer valid
            while (matchedCount == requiredCount) {
                // Update the minimum window
                if (end - start + 1 < minLength) {
                    minLength = end - start + 1;
                    minStart = start;
                }

                // Shrink the window by removing the character at `start`
                char startChar = s.charAt(start);
                windowCounts.put(startChar, windowCounts.get(startChar) - 1);

                // Check if the window is still valid
                if (required.containsKey(startChar) && windowCounts.get(startChar) < required.get(startChar)) {
                    matchedCount--;
                }

                start++; // Move the `start` pointer
            }

            end++; // Move the `end` pointer
        }

        // Return the minimum window substring
        return minLength == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLength);
    }
}
