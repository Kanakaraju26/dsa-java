package recursion.basicProgram;

import java.util.ArrayList;

public class factorial_numbers_less_than_or_equal_to_n {

    public static long findfact(long n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * findfact(n - 1); 
    }
    public static void main(String[] args) {
        ArrayList<Long> arr = new ArrayList<>();
        long n = 10;
        long i = 1;
        long fact = 1;
        while (fact <= n) {
            arr.add(fact);
            i++;
            fact = findfact(i); 
        }
        
        System.out.println(arr); 
    }
}
