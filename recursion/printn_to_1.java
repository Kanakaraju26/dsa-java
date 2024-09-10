package recursion;

public class printn_to_1 {
    static void printNos(int N) {
        if(N==0) return;
        System.out.print(N + " ");
        printNos(N-1);
    }
    public static void main(String[] args) {
        printNos(10);
    }
}
