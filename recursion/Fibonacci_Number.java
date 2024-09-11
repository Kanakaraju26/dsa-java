package recursion;

public class Fibonacci_Number {
    static int fib(int n){
        // Base cases
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        // Recursive case: F(n) = F(n-1) + F(n-2)
        return fib(n - 1) + fib(n - 2);

    }
    public static void main(String[] args) {
        System.out.println(fib(10));
    }
}
