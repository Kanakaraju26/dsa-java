package bitManipulation.learn;

public class divide_two_integers {
    public static int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;  // To prevent overflow
        }
        boolean negative = (dividend < 0) ^ (divisor < 0);
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);

        int quotient = 0;

        // Repeatedly subtract large multiples of the divisor
        while (absDividend >= absDivisor) {
            long tempDivisor = absDivisor, multiple = 1;
            // Left shift the divisor until it's larger than the dividend
            while (absDividend >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }
            // Subtract the largest multiple of the divisor
            absDividend -= tempDivisor;
            quotient += multiple;
        }

        // Apply the sign
        return negative ? -quotient : quotient;
    }
}
