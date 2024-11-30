package slidingWindow.hard;

import java.util.HashMap;

public class distinct_characters {
    public static int kDistinctChars(int K, String str) {
		// Write your code here
		if (str == null || str.length() == 0 || K == 0) {
            return 0;
        }

        // HashMap to store the frequency of characters in the current window
        HashMap<Character, Integer> charCount = new HashMap<>();
        int maxLength = 0;
        int start = 0;

        // Iterate through the string with the end pointer
        for (int end = 0; end < str.length(); end++) {
            char currentChar = str.charAt(end);

            // Add the current character to the map or update its frequency
            charCount.put(currentChar, charCount.getOrDefault(currentChar, 0) + 1);

            // If the number of distinct characters exceeds K, shrink the window
            while (charCount.size() > K) {
                char startChar = str.charAt(start);
                charCount.put(startChar, charCount.get(startChar) - 1);
                if (charCount.get(startChar) == 0) {
                    charCount.remove(startChar);
                }
                start++; // Shrink the window
            }

            // Update the maximum length of the valid substring
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
	}
}
