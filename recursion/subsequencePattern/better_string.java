package recursion.subsequencePattern;

import java.util.HashMap;

public class better_string {
    public static String betterString(String str1, String str2) {
        int count1 = countDistinctSubsequences(str1);
        int count2 = countDistinctSubsequences(str2);

        // Return str1 if counts are equal, otherwise return the string with the higher count
        return count1 >= count2 ? str1 : str2;
    }

    private static int countDistinctSubsequences(String str) {
        int n = str.length();
        int mod = 1_000_000_007;

        // dp[i] will store the count of distinct subsequences up to index i
        int[] dp = new int[n + 1];
        dp[0] = 1; // Empty subsequence

        // To track last occurrence of each character
        HashMap<Character, Integer> lastOccurrence = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            char currentChar = str.charAt(i - 1);

            // Double the count from the previous step
            dp[i] = (2 * dp[i - 1]) % mod;

            // If the character has been seen before, subtract the repeated subsequences
            if (lastOccurrence.containsKey(currentChar)) {
                int lastIdx = lastOccurrence.get(currentChar);
                dp[i] = (dp[i] - dp[lastIdx - 1] + mod) % mod;
            }

            // Update the last occurrence of the character
            lastOccurrence.put(currentChar, i);
        }

        // Subtract the empty subsequence count
        return dp[n] - 1;
    }
    public static void main(String[] args) {
        System.out.println(betterString("null", "mnmn"));
    }
}
