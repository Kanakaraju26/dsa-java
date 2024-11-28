package slidingWindow.medium;

import java.util.HashSet;

public class longest_substring_without_repeating_characters {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;  // To store the maximum length of a valid substring

        // Outer loop to set the start of the substring
        for (int i = 0; i < s.length(); i++) {
           HashSet<Character> set = new HashSet<>();  // To store unique characters
            int currentLength = 0;

            // Inner loop to extend the substring
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);

                // If character is already in the set, break
                if (set.contains(c)) {
                    break;
                }

                // Otherwise, add the character to the set and increment current length
                set.add(c);
                currentLength++;
            }

            // Update the maximum length if the current substring is longer
            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }
}
