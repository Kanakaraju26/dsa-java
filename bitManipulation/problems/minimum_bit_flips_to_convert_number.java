package bitManipulation.problems;

public class minimum_bit_flips_to_convert_number {
    public static int minBitFlips(int start, int goal) {
        int n = start ^ goal;
        int cnt = 0;
        while(n > 0){
            cnt+= n & 1;
            n >>= 1;
        }
        return cnt;
    }
    public static void main(String[] args) {
        System.out.println(minBitFlips(2, 4));
    }
}
