package patterns;

public class Reverse_Letter_Triangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) ('A' + j -1) + " ");
            }
            System.out.println();
        }
    }
}
