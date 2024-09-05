package patterns;

public class Increasing_Letter_Triangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // Convert j to the corresponding letter (A is 65 in ASCII)
                System.out.print((char) ('A' + j - 1) + " ");
            }
            System.out.println();
        }
    }
}
