package bitManipulation.learn;

public class check_whether_k_th_bit_is_set_or_not {
    static boolean checkKthBit(int n, int k) {
        // Your code here
        int m = 1 << k;
        return (m&n)!=0;
    }
    public static void main(String[] args) {
        System.out.println(checkKthBit(2, 1));
    }
}
