package bitManipulation.AdvMath;

public class count_primes {
    public static int countPrimes(int n) {
        if (n <= 2) return 0; // No primes less than 2

       // Step 1: Create an array to mark primes
       boolean[] isPrime = new boolean[n];
       for (int i = 2; i < n; i++) {
           isPrime[i] = true; // Assume all numbers are prime
       }

       // Step 2: Mark non-prime numbers
       for (int i = 2; i * i < n; i++) {
           if (isPrime[i]) {
               // Mark multiples of i as non-prime
               for (int j = i * i; j < n; j += i) {
                   isPrime[j] = false;
               }
           }
       }

       // Step 3: Count primes
       int count = 0;
       for (int i = 2; i < n; i++) {
           if (isPrime[i]) {
               count++;
           }
       }

       return count;
   }
   public static void main(String[] args) {
        System.out.println(countPrimes(7));
   }
}
