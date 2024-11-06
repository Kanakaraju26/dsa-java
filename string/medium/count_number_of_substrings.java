package string.medium;

import java.util.HashMap;

public class count_number_of_substrings {
    public static long substrCount(String s, int K) {
        return countSubstringsWithAtMostKDistinct(s, K) - countSubstringsWithAtMostKDistinct(s, K - 1);
    }

    private static long countSubstringsWithAtMostKDistinct(String s, int K) {
        if (K == 0) return 0;
        
        HashMap<Character, Integer> charCount = new HashMap<>();
        int left = 0;
        long count = 0;

        // Sliding window
        for (int right = 0; right < s.length(); right++) {
            // Add the current character to the map
            char currentChar = s.charAt(right);
            charCount.put(currentChar, charCount.getOrDefault(currentChar, 0) + 1);

            // If there are more than K distinct characters, shrink the window from the left
            while (charCount.size() > K) {
                char leftChar = s.charAt(left);
                charCount.put(leftChar, charCount.get(leftChar) - 1);
                if (charCount.get(leftChar) == 0) {
                    charCount.remove(leftChar);
                }
                left++;
            }

            // Count substrings ending at right
            count += (right - left + 1);
        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println(substrCount("null", 2));
    }
}
