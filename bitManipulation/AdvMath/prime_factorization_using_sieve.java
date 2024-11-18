package bitManipulation.AdvMath;

import java.util.ArrayList;
import java.util.List;

public class prime_factorization_using_sieve {
    static List<Integer> findPrimeFactors(int N) {
        // code here
        List<Integer> ls = new ArrayList<>();
        for(int i=2;i<=N;i++){
            if(N==1) break;
            while(N%i==0){
                ls.add(i);
                N=N/i;
            }
        }
        return ls;
    }
    public static void main(String[] args) {
        System.out.println(findPrimeFactors(7));
    }
}
