package notes;

public class CharMethodsExample {
    public static void main(String[] args) {
        char c = 'a';
        char c2 = 'A';
        char c3 = '1';
        char c4 = ' ';

        // 1. isLetter(): Checks if the char is a letter
        System.out.println(c + " is a letter: " + Character.isLetter(c));

        // 2. isDigit(): Checks if the char is a digit
        System.out.println(c3 + " is a digit: " + Character.isDigit(c3));

        // 3. isLetterOrDigit(): Checks if the char is a letter or digit
        System.out.println(c + " is a letter or digit: " + Character.isLetterOrDigit(c));
        System.out.println(c3 + " is a letter or digit: " + Character.isLetterOrDigit(c3));

        // 4. isWhitespace(): Checks if the char is a whitespace character
        System.out.println("'" + c4 + "' is a whitespace: " + Character.isWhitespace(c4));

        // 5. isUpperCase(): Checks if the char is uppercase
        System.out.println(c2 + " is uppercase: " + Character.isUpperCase(c2));

        // 6. isLowerCase(): Checks if the char is lowercase
        System.out.println(c + " is lowercase: " + Character.isLowerCase(c));

        // 7. toUpperCase(): Converts the char to uppercase
        System.out.println(c + " to uppercase: " + Character.toUpperCase(c));

        // 8. toLowerCase(): Converts the char to lowercase
        System.out.println(c2 + " to lowercase: " + Character.toLowerCase(c2));

        // 9. isAlphabetic(): Checks if the char is alphabetic
        System.out.println(c + " is alphabetic: " + Character.isAlphabetic(c));

        // 10. getNumericValue(): Returns the numeric value of the char
        System.out.println(c3 + " numeric value: " + Character.getNumericValue(c3));

        // 11. charValue(): Returns the char value of Character object
        @SuppressWarnings("removal")
        Character charObject = new Character(c);
        System.out.println("Character object value: " + charObject.charValue());

        // 12. compare(): Compares two chars lexicographically
        System.out.println("Compare 'a' and 'A': " + Character.compare('a', 'A'));

        // 13. isDefined(): Checks if the char is a defined Unicode character
        System.out.println(c + " is a defined Unicode character: " + Character.isDefined(c));

        // 14. forDigit(): Converts a digit to the corresponding char
        System.out.println("Character for digit 5: " + Character.forDigit(5, 10));

        // 15. toString(): Converts a char to a String
        System.out.println("String representation of char 'a': " + Character.toString(c));
    }
}
