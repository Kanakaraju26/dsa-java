package recursion.subsequencePattern;

import java.util.ArrayList;
import java.util.List;

public class generate_parentheses {
    public static List<String> generateParenthesis(int n) {
         List<String> result = new ArrayList<>();
        generateParenthesisRecursive(result, "", 0, 0, n);
        return result;
    }

    private static void generateParenthesisRecursive(List<String> result, String current, int openCount, int closeCount, int n) {
        // Base case: if the current string has used all pairs, add it to the result
        if (openCount == n && closeCount == n) {
            result.add(current);
            return;
        }

        // If we can add an opening parenthesis, add it and recurse
        if (openCount < n) {
            generateParenthesisRecursive(result, current + "(", openCount + 1, closeCount, n);
        }

        // If we can add a closing parenthesis, add it and recurse
        if (closeCount < openCount) {
            generateParenthesisRecursive(result, current + ")", openCount, closeCount + 1, n);
        }
    }
    public static void main(String[] args) {
        System.out.println(generateParenthesis(4));
    }
}
