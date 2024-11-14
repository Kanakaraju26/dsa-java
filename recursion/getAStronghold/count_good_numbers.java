package recursion.getAStronghold;

public class count_good_numbers {
    private static final int MOD = 1000000007;
    public static int countGoodNumbers(long n) {
        // Calculate number of positions
        long evenPositions = (n + 1) / 2;
        long oddPositions = n / 2;

        // Calculate (5^evenPositions) % MOD and (4^oddPositions) % MOD
        long evenChoices = modPow(5, evenPositions);
        long oddChoices = modPow(4, oddPositions);

        // Multiply results and take modulus
        return (int) ((evenChoices * oddChoices) % MOD);
    }

    // Recursive function to perform modular exponentiation
    private static long modPow(long x, long y) {
        if (y == 0)
            return 1; // Base case
        x %= MOD;

        // If y is even, use (x^y) = (x^(y/2)) * (x^(y/2))
        if (y % 2 == 0) {
            long half = modPow(x, y / 2);
            return (half * half) % MOD;
        } else {
            // If y is odd, use (x^y) = x * (x^(y-1))
            return (x * modPow(x, y - 1)) % MOD;
        }

    }
    public static void main(String[] args) {
        countGoodNumbers(234);
    }
}
