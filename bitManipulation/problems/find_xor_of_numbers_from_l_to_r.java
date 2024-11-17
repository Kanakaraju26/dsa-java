package bitManipulation.problems;

public class find_xor_of_numbers_from_l_to_r {
    public static int findXOR(int L, int R) {
        return xorTill(R) ^ xorTill(L - 1);
    }
    public static int xorTill(int n) {
        if (n % 4 == 0) return n;
        if (n % 4 == 1) return 1;
        if (n % 4 == 2) return n + 1;
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(findXOR(2, 3));
    }
}
