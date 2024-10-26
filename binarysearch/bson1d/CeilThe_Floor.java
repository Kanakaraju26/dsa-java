package binarysearch.bson1d;

public class CeilThe_Floor {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        // Wriute your code here.
          int left = 0;
          int right = n-1;
          int floor = Integer.MIN_VALUE;
          int ceil = Integer.MAX_VALUE;
          while(left <= right){
            int mid = left + (right - left)/2;
            if(a[mid]==x) return new int[] {a[mid],a[mid]};
            else if(a[mid]>x){
               ceil = Math.min(ceil,a[mid]);
               right = mid -1;
            }else{
              floor = Math.max(floor,a[mid]);
              left = mid + 1;
            }
          }
          if (floor == Integer.MIN_VALUE) floor = -1;
          if (ceil == Integer.MAX_VALUE) ceil = -1;
          return new int[] {floor,ceil};  
      }
      public static void main(String[] args) {
        @SuppressWarnings("unused")
        int[] arr = getFloorAndCeil(new int[] {2,4,6,8}, 4, 5);
      }
}
