package string.easy;

public class reverse_words_in_a_string {
    public static String reverseWords(String s) {
        // Step 1: Trim any leading or trailing spaces and split by spaces
    String[] words = s.trim().split("\\s+");

    // Step 2: Reverse the array of words
    StringBuilder result = new StringBuilder();
    for (int i = words.length - 1; i >= 0; i--) {
        result.append(words[i]);
        if (i != 0) {
            result.append(" "); // Add a space between words
        }
    }

    // Step 3: Convert StringBuilder to String and return
    return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverseWords("mmiiimm"));
    }
}
