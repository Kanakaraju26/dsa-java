package math;

public class Reverse_Integer {
    public static void main(String[] args) {
        int x = 9;
        int reversed = 0;
        
        while (x != 0) {
            int digit = x % 10;  
            x /= 10;             
            
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                System.out.println(0);  
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                System.out.println(0);  
            }
            
            reversed = reversed * 10 + digit;
        }
        
        System.out.println(reversed) ;
    }
}
