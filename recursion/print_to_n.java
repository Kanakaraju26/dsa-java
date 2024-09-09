package recursion;

public class print_to_n {
    public static void printNos(int N)
    {
       if(N==0) return;
       printNos(N-1);
       System.out.print(N + " ");
    }
    public static void main(String[] args) {
        int n = 10;
        printNos(n);
    }
}
