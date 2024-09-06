package patterns;

public class Symmetry {
    public static void main(String[] args) {
        int nums;
        int n = 5;

        // Determine initial number of spaces in the middle
        if (n % 2 == 0) {
            nums = n + 2;
        } else {
            nums = n + 1;
        }

        // Upper part of the pattern (excluding middle line)
        for (int i = 0; i < n - 1; i++) {
            // Print left stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            // Print middle spaces (use double spaces for symmetry)
            for (int j = 0; j < nums * 2; j++) {
                System.out.print(" ");
            }

            // Decrease middle spaces for the next row
            nums = nums - 2;

            // Print right stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Middle line (printed once)
        for (int i = 0; i < n*2; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // Lower part of the pattern (excluding middle line)
        nums = nums + 2;
        for (int i = n - 2; i >= 0; i--) {            
            // Print left stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            // Print middle spaces (use double spaces for symmetry)
            for (int j = 0; j < nums * 2; j++) {
                System.out.print(" ");
            }

            // Increase middle spaces for the next row
            nums = nums + 2;

            // Print right stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
