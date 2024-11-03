package string.easy;

public class longest_common_prefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
        return "";
    }

    // Start with the first string as the initial prefix
    String prefix = strs[0];

    // Compare the prefix with each string in the array
    for (int i = 1; i < strs.length; i++) {
        // Reduce the prefix length until it matches the beginning of strs[i]
        while (strs[i].indexOf(prefix) != 0) {
            
            prefix = prefix.substring(0, prefix.length() - 1);
            // If the prefix becomes empty, there's no common prefix
            if (prefix.isEmpty()) {
                return "";
            }
        }
    }

    return prefix;
    }
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[] {"mm","mmmmm","mmmmmm"}));
    }
}
