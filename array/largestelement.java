package array;

public class largestelement{
    public static int largest(int[] arr) {
        // code here
        int max = -1;
        for (int i=0;i<arr.length;i++){
            if (max < arr[i]) 
                max = arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {5,2,6,1,7,2,8};
        System.out.println(largest(arr));
    }
}