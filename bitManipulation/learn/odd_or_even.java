package bitManipulation.learn;

public class odd_or_even {
    static String oddEven(int n) {
        if(n% (1<<1)==0)
            return "even";
        else
            return "odd";
            
    }
    public static void main(String[] args) {
        System.out.println(oddEven(2));
    }
}
