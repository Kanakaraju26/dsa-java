package recursion.getAStronghold;

public class string_to_integer_atoi {
    public static int myAtoi(String s) {
        s = s.trim(); // Remove leading whitespace
      if (s.isEmpty()) return 0;

      // Check for sign
      int index = 0;
      boolean isNegative = false;
      if (s.charAt(0) == '-' || s.charAt(0) == '+') {
          isNegative = s.charAt(0) == '-';
          index++;
      }

      // Use helper method to calculate the number recursively
      return convertRecursively(s, index, 0, isNegative);
  }

  // Recursive helper function to build the integer
  private static int convertRecursively(String s, int index, int result, boolean isNegative) {
      // Base case: Stop if we're at the end of the string or current char is non-digit
      if (index >= s.length() || !Character.isDigit(s.charAt(index))) {
          return result;
      }

      int digit = s.charAt(index) - '0';

      // Check for overflow/underflow before adding the digit
      if (isNegative) {
          if (result < (Integer.MIN_VALUE + digit) / 10) {
              return Integer.MIN_VALUE; // Underflow case
          }
          result = result * 10 - digit; // Subtract for negative
      } else {
          if (result > (Integer.MAX_VALUE - digit) / 10) {
              return Integer.MAX_VALUE; // Overflow case
          }
          result = result * 10 + digit; // Add for positive
      }

      // Recursive call to process the next character
      return convertRecursively(s, index + 1, result, isNegative);
  }
  public static void main(String[] args) {
    System.out.println(myAtoi("null"));
  }
}
