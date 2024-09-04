package patterns;

public class binary_number_triangle {
    public static void main(String[] args) {
        int n = 5;
        boolean flag1 = true;
        for (int i = 0; i < n; i++) {
             if (i%2!=0){
                    flag1 = false;
                }else{
                    flag1 = true;
                }
            for (int j = 0; j <= i; j++) {
                
                if(flag1){
                    System.out.print("1 ");
                    flag1 = false;
                }else{
                    System.out.print("0 ");
                    flag1 = true;
                }
            }
            System.out.println();
        }
    }
}
