package math;

public class Palindrome_Number {
    public static void main(String[] args) {
        int x = 5;
        if(x<0){
            System.out.println(false) ;
        }
        int rev = 0;
        int temp = x;
        while(temp!=0){
            int digit = temp%10;
            rev = rev*10+digit;
            temp/=10;
        }
        System.out.println((rev==x)) ;
    }
}
