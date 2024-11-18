package bitManipulation.AdvMath;

import java.util.ArrayList;

public class prime_factors {
    public static int[] AllPrimeFactors(int N){
        // code here
         ArrayList<Integer> al = new ArrayList<>();
        
        for(int i=2;i*i<=N;i++){
            
            if(N%i==0)al.add(i);
            while(N%i==0)N/=i;
            
        }
        if(N!=1)al.add(N);
        
        int ar[]= new int[al.size()];
        for(int i=0;i<ar.length;i++){
            ar[i]=al.get(i);
        }
        
        return ar;
    }
    public static void main(String[] args) {
        System.out.println(AllPrimeFactors(4));
    }
}
