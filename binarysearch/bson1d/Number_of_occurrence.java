package binarysearch.bson1d;

public class Number_of_occurrence {
   static  int count(int[] arr, int k) {
        // code here
        int left = findleft(arr,k);
        if(left==-1) return 0;
        int right = findright(arr,k);
        if(right==-1) return 0;
        else return right-left + 1;
    }
   static  int findleft(int[] arr,int k){
        int l = 0;
        int a = -1;
        int r = arr.length-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(arr[mid]<k) l = mid+1;
            else if(k<arr[mid]) r = mid -1;
            else {
                a = mid;
                r = mid-1;
            }
        }
        return a;
    }
   static  int findright(int[] arr,int k){
        int l = 0;
        int a = -1;
        int r = arr.length-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(arr[mid]<k) l = mid+1;
            else if(k<arr[mid]) r = mid -1;
            else {
                a = mid;
                l = mid+1;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(count(new int[]{2,2,2,3,3,3,4,4}, 4));
    }
}
