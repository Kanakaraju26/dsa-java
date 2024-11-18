package bitManipulation.AdvMath;

public class powx_n {
    public static double myPow(double x, int n) {
        // if (n == 0) return 1;

        // // If n is negative, calculate positive power and take reciprocal
        // if (n < 0) {
        // x = 1 / x;
        // // Handle edge case where n is Integer.MIN_VALUE
        // if (n == Integer.MIN_VALUE) {
        // return x * myPow(x, Integer.MAX_VALUE);
        // }
        // n = -n;
        // }

        // // Recursive step
        // double half = myPow(x, n / 2);

        // // If n is even, just multiply the half results
        // if (n % 2 == 0) {
        // return half * half;
        // } else { // If n is odd, multiply an additional x
        // return half * half * x;
        // }
        return (double) Math.pow(x, n);
    }

    public static void main(String[] args) {
        System.out.println(myPow(4, 8));
    }
}
