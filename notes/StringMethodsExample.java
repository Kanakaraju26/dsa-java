package notes;

public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // 1. charAt(index): Returns the character at the specified index
        char ch = str.charAt(1);
        System.out.println("charAt(1): " + ch);

        // 2. length(): Returns the length of the string
        int length = str.length();
        System.out.println("length(): " + length);

        // 3. substring(beginIndex, endIndex): Extracts a substring
        String subStr = str.substring(0, 5);
        System.out.println("substring(0, 5): " + subStr);

        // 4. contains(CharSequence): Checks if the string contains a sequence
        boolean containsHello = str.contains("Hello");
        System.out.println("contains(\"Hello\"): " + containsHello);

        // 5. equals(): Compares two strings for equality
        boolean equalsStr = str.equals("Hello, World!");
        System.out.println("equals(\"Hello, World!\"): " + equalsStr);

        // 6. equalsIgnoreCase(): Compares two strings ignoring case
        boolean equalsIgnoreCaseStr = str.equalsIgnoreCase("hello, world!");
        System.out.println("equalsIgnoreCase(\"hello, world!\"): " + equalsIgnoreCaseStr);

        // 7. indexOf(): Returns the index of the first occurrence of a substring
        int indexOfWorld = str.indexOf("World");
        System.out.println("indexOf(\"World\"): " + indexOfWorld);

        // 8. isEmpty(): Checks if the string is empty
        boolean isEmptyStr = str.isEmpty();
        System.out.println("isEmpty(): " + isEmptyStr);

        // 9. replace(): Replaces occurrences of a substring with another string
        String replacedStr = str.replace("World", "Java");
        System.out.println("replace(\"World\", \"Java\"): " + replacedStr);

        // 10. toLowerCase(): Converts the string to lowercase
        String lowerCaseStr = str.toLowerCase();
        System.out.println("toLowerCase(): " + lowerCaseStr);

        // 11. toUpperCase(): Converts the string to uppercase
        String upperCaseStr = str.toUpperCase();
        System.out.println("toUpperCase(): " + upperCaseStr);

        // 12. trim(): Removes leading and trailing whitespace
        String trimStr = "   Hello, World!   ".trim();
        System.out.println("trim(): \"" + trimStr + "\"");

        // 13. split(): Splits the string into an array based on a delimiter
        String[] splitStr = str.split(", ");
        System.out.println("split(\", \"): ");
        for (String part : splitStr) {
            System.out.println(part);
        }

        // 14. startsWith(): Checks if the string starts with a specified prefix
        boolean startsWithHello = str.startsWith("Hello");
        System.out.println("startsWith(\"Hello\"): " + startsWithHello);

        // 15. endsWith(): Checks if the string ends with a specified suffix
        boolean endsWithExclamation = str.endsWith("!");
        System.out.println("endsWith(\"!\"): " + endsWithExclamation);

        // 16. concat(): Concatenates two strings
        String concatStr = str.concat(" How are you?");
        System.out.println("concat(\" How are you?\"): " + concatStr);

        // 17. valueOf(): Converts different types to a string
        String intValue = String.valueOf(123);
        System.out.println("valueOf(123): " + intValue);

        // 18. compareTo(): Compares two strings lexicographically
        int compareToStr = str.compareTo("Hello, World!");
        System.out.println("compareTo(\"Hello, World!\"): " + compareToStr);

        // 19. matches(): Tests if the string matches a regular expression
        boolean matchesPattern = str.matches(".*World.*");
        System.out.println("matches(\".*World.*\"): " + matchesPattern);

        // 20. toCharArray(): Converts the string into a character array
        char[] charArray = str.toCharArray();
        System.out.println("toCharArray(): ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
    }
}
