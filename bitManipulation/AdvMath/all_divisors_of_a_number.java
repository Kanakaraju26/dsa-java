package bitManipulation.AdvMath;

import java.util.Set;
import java.util.TreeSet;

public class all_divisors_of_a_number {
    public static void print_divisors(int n) {
        // code here
        Set<Integer> set = new TreeSet<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                set.add(i);
                if (n / i != i)
                    set.add(n / i);
            }
        }
        for (int i : set) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        print_divisors(8);
    }
}
