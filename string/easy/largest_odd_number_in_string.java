package string.easy;

public class largest_odd_number_in_string {
    public static String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            // Check if the current digit is odd
            if ((num.charAt(i) - '0') % 2 != 0) {
                // Return the substring from start to the current index
                return num.substring(0, i + 1);
            }
        }
        // If no odd digit was found, return an empty string
        return "";
    }

    public static void main(String[] args) {
        System.out.println(largestOddNumber("qwertyytrewqa"));
    }
}
