package math;

public class Sum_of_all_divisors_from_1_to_n {
    public static void main(String[] args) {
        long totalSum = 0; 
        int  N = 5;

        for (int i = 1; i <= N; i++) {
            for (int j = i; j <= N; j += i) {
                totalSum += i;
            }
        }
        System.out.println(totalSum);
    }
}
