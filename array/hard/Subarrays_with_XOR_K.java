package hard;

public class Subarrays_with_XOR_K {
    public static int subarraysWithSumK(int []a, int b) {
        // Write your code here
         int count = 0;
        for(int i=0;i<a.length;i++){
            int current = 0;
            for(int j=i;j<a.length;j++){
                current^=a[j];
                if(current==b){
                    count++;
                }
            }
           
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(subarraysWithSumK(new int[] {4,2,5,1,6,1}, 5));
    }
}
