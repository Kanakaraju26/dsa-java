package bitManipulation.learn;

public class bit_manipulation {
    static void bitManipulation(int num, int i) {
        int ithBit = getIthBit(num, i);
        int setBit = setIthBit(num, i);
        int clearedBit = clearIthBit(num, i);

        System.out.print(ithBit + " " + setBit + " " + clearedBit);
    }

    public static int getIthBit(int num, int i) {
        int mask = 1 << (i - 1);
        return (num & mask) != 0 ? 1 : 0;
    }

    public static int setIthBit(int num, int i) {
        int mask = 1 << (i - 1);
        return num | mask;
    }

    public static int clearIthBit(int num, int i) {
        int mask = ~(1 << (i - 1));
        return num & mask;
    }
    public static void main(String[] args) {
        bitManipulation(7, 1);
    }
}
