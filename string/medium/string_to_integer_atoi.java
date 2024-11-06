package string.medium;

public class string_to_integer_atoi {
    public static int myAtoi(String s) {
        if (s == null || s.length() == 0) {
           return 0;
       }
       
       // Step 1: Trim leading whitespace
       int i = 0;
       int n = s.length();
       while (i < n && s.charAt(i) == ' ') {
           i++;
       }
       
       // Check if we've reached the end after trimming whitespace
       if (i >= n) {
           return 0;
       }
       
       // Step 2: Determine the sign
       boolean isNegative = false;
       if (s.charAt(i) == '-') {
           isNegative = true;
           i++;
       } else if (s.charAt(i) == '+') {
           i++;
       }
       
       // Step 3: Read the digits and convert to integer
       int result = 0;
       while (i < n && Character.isDigit(s.charAt(i))) {
           int digit = s.charAt(i) - '0';
           
           // Check for overflow
           if (result > (Integer.MAX_VALUE - digit) / 10) {
               return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
           }
           
           result = result * 10 + digit;
           i++;
       }
       
       // Step 4: Apply the sign
       return isNegative ? -result : result;
   }
   public static void main(String[] args) {
    System.out.println(myAtoi("null"));
   }
}
