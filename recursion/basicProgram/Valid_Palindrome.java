package recursion.basicProgram;

public class Valid_Palindrome {
    // Helper method to remove non-alphanumeric characters and convert to lowercase
    static String removeNonAlphanumeric(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // Check if the character is a letter or a digit
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));  // Append lowercase character
            }
        }
        return sb.toString();
    }

    // Helper method to check if the string is a palindrome
    static boolean checkPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;  // Not a palindrome
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindrome(String s) {
        if (s == null || s.isEmpty() || s.length()==1) {
            return true;  // Empty or null string is considered a palindrome
        }
        
        // Remove non-alphanumeric characters and convert to lowercase
        s = removeNonAlphanumeric(s);
        
        // Check if the cleaned-up string is a palindrome
        return checkPalindrome(s);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("MmmuioppoiummM"));
    }
}
