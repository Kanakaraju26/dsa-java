package binarysearch.bson2d;

public class median_in_a_row_wise_sorted_matrix1 {
    static int median(int matrix[][], int R, int C) {
    int median = (R*C)/2+1;
    int low  = 0;
    int high = Integer.MAX_VALUE;
    while(low<high){
        int mid = low+(high-low)/2;
        int count = 0;
        for(int i=0;i<R;i++){
            count += binarySearch(matrix[i],mid);
        }
        
        if(count<median)
            low = mid+1;
        else 
            high = mid;
    }
    return low;
}

public static int binarySearch(int[] arr,int key){
    int l = 0;
    int r = arr.length;
    while(l<r){
        int mid = l+(r-l)/2;
        if(arr[mid]<=key)
            l = mid+1;
        else
            r = mid;
    }
    return l;
}
public static void main(String[] args) {
    System.out.println(median(new int[][] {{1,2,3},{4,5,6},{7,8,9}}, 3, 3));
}
}
  