package bitManipulation.learn;

import java.util.Arrays;
import java.util.List;

public class swap_two_number {
    static List<Integer> get(int a,int b)
    {
        a = a ^ b; // Step 1: a becomes the XOR of a and b
        b = a ^ b; // Step 2: b becomes the original value of a
        a = a ^ b; // Step 3: a becomes the original value of b
        return Arrays.asList(a, b); 
    }
    public static void main(String[] args) {
        System.out.println(get(2, 3));
    }
}
