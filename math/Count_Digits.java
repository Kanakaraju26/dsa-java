package math;

public class Count_Digits {
    public static void main(String[] args) {
        int N = 5;
        String s = String.valueOf(N);
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            int num = Character.getNumericValue(s.charAt(i));
            if (num != 0 && N % num == 0) {
                count += 1;
            }
        }
        System.out.println(count) ;
    }
}