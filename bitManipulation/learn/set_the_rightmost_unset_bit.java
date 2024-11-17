package bitManipulation.learn;

public class set_the_rightmost_unset_bit {
    static int setBit(int n) {
        return n | (n + 1);
    }

    public static void main(String[] args) {
        System.out.println(setBit(4));
    }
}
