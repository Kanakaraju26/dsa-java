package math;

public class LCM_And_GCD {
    static Long gcd(Long A, Long B) {
        while (B != 0) {
            Long temp = B;
            B = A % B;
            A = temp;
        }
        return A;
    }
    public static void main(String[] args) {

        Long A = 5L;
        Long B = 5L;
        
        Long[] arr = new Long[2];
        
        Long gcd = gcd(A, B);
        Long lcm = (A * B) / gcd;
        
        arr[0] = lcm;
        arr[1] = gcd;
        
        System.out.println(arr[0]+arr[1]+"");
    }
}
