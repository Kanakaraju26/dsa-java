package string.easy;

public class remove_outermost_parentheses {
    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int balance = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                // If balance is greater than 0, it means it's not an outer parenthesis
                if (balance > 0) {
                    result.append(c);
                }
                balance++;
            } else { // c == ')'
                balance--;
                // If balance is greater than 0 after decrement, it’s not an outer parenthesis
                if (balance > 0) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("mmmnnnn"));
    }
}
