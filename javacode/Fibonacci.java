package javacode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
 		Scanner sc = new Scanner(System.in);
        int ans = sc.nextInt();

        List<Integer> arr = new ArrayList<>(ans + 1);
        arr.add(0); 
        arr.add(1);  

        for (int i = 2; i <= ans; i++) {
            int next = arr.get(i-1) + arr.get(i-2);  
            arr.add(next);
        }
        sc.close();        
        System.out.println(arr.get(ans));  
	}

}
