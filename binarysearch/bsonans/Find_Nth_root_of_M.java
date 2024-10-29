package binarysearch.bsonans;

public class Find_Nth_root_of_M {
    public static int NthRoot(int n, int m)
    {
        int left = 0;
        int right = m;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(Math.pow(mid,n)==m) return mid;
            else if(Math.pow(mid,n)>m){
                right = mid -1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(NthRoot(3, 5));
    }
}
