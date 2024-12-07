package Greedy.easy;

public class valid_parenthesis_string {
    public boolean checkValidString(String s) {
        if(s.length()==1 && s.equals("*")) return true;
        if(s.charAt(s.length()-1)=='(') return false;
        if(s.charAt(0)==')') return false;

         int low = 0;  // Minimum number of open parentheses
        int high = 0; // Maximum number of open parentheses

        for (char c : s.toCharArray()) {
            if (c == '(') {
                low++; 
                high++;
            } else if (c == ')') {
                low = Math.max(low - 1, 0); // Ensure low doesn't go negative
                high--;
            } else if (c == '*') {
                low = Math.max(low - 1, 0); // '*' as ')'
                high++;                    // '*' as '('
            }

            // If high goes negative, it means there are unmatched ')'
            if (high < 0) return false;
        }

        // If low is 0, all open parentheses are matched
        return low == 0;
    }
}
