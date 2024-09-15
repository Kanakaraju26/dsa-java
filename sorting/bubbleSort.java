package sorting;

public class bubbleSort{
    public static void main(String[] args) {
        int[] arr = {2,4,1,8,1,3,0,9};
        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}