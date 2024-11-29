package slidingWindow.medium;

public class number_of_substrings_containing_all_three_characters {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int[] count = new int[3]; // Count for 'a', 'b', 'c'
        int left = 0;
        int result = 0;

        for (int right = 0; right < n; right++) {
            // Update the count for the current character
            count[s.charAt(right) - 'a']++;

            // Check if the window is valid (contains at least one of each character)
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                // Add the number of valid substrings starting from `left`
                result += n - right;

                // Shrink the window by moving `left` and updating the count
                count[s.charAt(left) - 'a']--;
                left++;
            }
        }

        return result;
    }
}
