package binarysearch.bson1d;

public class Implement_Upper_Bound {
    public static int upperBound(int []arr, int x, int n){
        int left = 0;
        int right = arr.length;
        int answer = arr.length; 

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > x) {
                answer = mid;  
                right = mid;
            } else {
                left = mid + 1; 
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(upperBound(new int[] {3,4,5,6,9},7,5));
    }
 
}
