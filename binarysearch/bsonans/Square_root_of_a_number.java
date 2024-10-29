package binarysearch.bsonans;

public class Square_root_of_a_number {
    static long floorSqrt(long n) {
        // Your code here
        long left = 0;
        long right = n;
        long ans = 1; 
        while(left<=right){
            long mid = left+(right-left)/2;
            if(mid==0) break;
            if(mid*mid==n) return mid;
            else if(mid*mid>n){
                right = mid-1; 
            }else{
                ans = mid;
                left = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(floorSqrt(5));
    }
}
