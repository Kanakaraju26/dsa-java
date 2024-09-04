package patterns;

public class rotatedtriangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i==n-1) {
                for (int j = n-1; j > 0; j--) {
                    for (int k = j; k > 0; k--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

            }
        }
    }
}
