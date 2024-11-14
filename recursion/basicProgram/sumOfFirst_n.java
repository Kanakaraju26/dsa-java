package recursion.basicProgram;

public class sumOfFirst_n {
    public static long sumOfSeries(long n) {
        if(n==0) return 0;
        
        return (n*n*n) + sumOfSeries(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sumOfSeries(10));
    }
}
