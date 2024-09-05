package patterns;

public class Alpha_Ramp {
    public static void main(String[] args) {
        int n = 5;
        int nums = 65;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (nums) + " ");
            }
            nums+=1;
            System.out.println();
        }
    }
}
