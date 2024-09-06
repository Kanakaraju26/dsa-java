package patterns;

public class  Alpha_Triangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            int nums = 65 + n - 1;
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (nums) + " ");
                nums--;
            }
            System.out.println();
        }
    }
}
