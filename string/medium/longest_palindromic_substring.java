package string.medium;

public class longest_palindromic_substring {
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        
        int start = 0, end = 0;
        
        for (int i = 0; i < s.length(); i++) {
            // Expand around i as a single character center
            int len1 = expandAroundCenter(s, i, i);
            // Expand around i and i+1 as a two-character center
            int len2 = expandAroundCenter(s, i, i + 1);
            
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; // Length of the palindrome
    }
    public static void main(String[] args) {
        System.out.println(longestPalindrome("null"));
    }
}
