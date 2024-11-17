package bitManipulation.learn;

public class count_total_set_bits {
    public static int countSetBits(int n){
        int count = 0;
    int powerOfTwo = 1;

    while (powerOfTwo <= n) {
        int totalPairs = (n + 1) / (2 * powerOfTwo);
        count += totalPairs * powerOfTwo;

        int remainder = (n + 1) % (2 * powerOfTwo);
        if (remainder > powerOfTwo) {
            count += remainder - powerOfTwo;
        }

        powerOfTwo *= 2;
    }

    return count;
    }
}
