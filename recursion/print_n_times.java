package recursion;

public class print_n_times {
    static void printGfg(int N) {
        // code here
        if(N==0) return;
        System.out.print("GFG ");
        
        printGfg(N-1);
    }
    public static void main(String[] args) {
        printGfg(15);
    }
}
