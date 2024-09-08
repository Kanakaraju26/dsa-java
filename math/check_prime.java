package math;

public class check_prime {
    public static void main(String[] args) {
        	int num =5;	
		if(num==1)
        System.out.println(false);

    for (int i = 2; i < num; i++) {
        if(num%i==0){
            System.out.print("NO");
            // return false;
        }
    }
    System.out.print("YES");
    // return true;
    }
}
