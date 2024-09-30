package easy;
public class Sorted_Array_Search {
    static int searchInSorted(int[] arr, int N, int K) {

        // Your code here
        for(int i=0;i<N;i++){
            if(arr[i]==K){
                return 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,70};
        System.out.print(searchInSorted(arr, 7, 70));
    }
}
