package math;

import java.util.Scanner;

public class  Check_Armstrong {
    public static void main(String[] args) {
        int total = 0;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int og = num;
		String s = Integer.toString(num);

		for (int i = 1; i <= s.length(); i++) {
			int temp = num%10;
			total += Math.pow(temp,s.length());
			num/=10;
		}
        sc.close();
		boolean status = total==og;
		System.out.print(status);
    }
}
