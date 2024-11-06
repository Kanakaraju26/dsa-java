package string.medium;

public class sum_of_beauty_of_all_substrings {
    public static int beautySum(String s) {
        int totalBeauty = 0;

        // Iterate through each starting point of substring
        for (int i = 0; i < s.length(); i++) {
            int[] freq = new int[26];  // Frequency array for current substring starting at i

            // Extend the substring from i to each subsequent character
            for (int j = i; j < s.length(); j++) {
                freq[s.charAt(j) - 'a']++;  // Increment frequency of the current character

                // Calculate beauty for the substring s[i:j]
                totalBeauty += calculateBeauty(freq);
            }
        }
        return totalBeauty;
    }
    private static int calculateBeauty(int[] freq) {
        int max = 0;
        int min = Integer.MAX_VALUE;

        for (int count : freq) {
            if (count > 0) {
                max = Math.max(max, count);
                min = Math.min(min, count);
            }
        }
        return max - min;
    }
    public static void main(String[] args) {
        System.out.println(beautySum("null"));
    }
}
