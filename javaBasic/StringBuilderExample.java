package javaBasic;

// .append .insert .delete .reverse .toString .length .setLength

public class StringBuilderExample {
    public static void main(String[] args) {
        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder();

        // Append strings to the StringBuilder
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        System.out.println("After appending: " + sb);

        // Insert a string at a specified position
        sb.insert(6, "Java ");
        System.out.println("After inserting 'Java': " + sb);

        // Delete a portion of the string
        sb.delete(6, 11); // Removes "Java"
        System.out.println("After deleting 'Java': " + sb);

        // Reverse the string
        sb.reverse();
        System.out.println("After reversing: " + sb);

        // Convert StringBuilder to String
        String result = sb.toString();
        System.out.println("Final string: " + result);

        // Find the length of the StringBuilder
        int length = sb.length();
        System.out.println("Length of StringBuilder: " + length);

        // Set the length of the StringBuilder (trim or expand)
        sb.setLength(5); // Keeps only the first 5 characters
        System.out.println("After setting length to 5: " + sb);
    }
}
