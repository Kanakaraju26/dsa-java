package binarysearch.bsonans;

public class koko_eating_bananas {
    public static int minEatingSpeed(int[] piles, int h) {
        int left = 1; // Minimum possible speed
       int right = getMaxPile(piles); // Maximum pile size (upper limit for speed)

       // Perform binary search to find the minimum k
       while (left < right) {
           int mid = left + (right - left) / 2;

           if (canFinish(piles, h, mid)) {
               right = mid; // Try a smaller speed
           } else {
               left = mid + 1; // Increase the speed
           }
       }
       return left;
   }

   // Helper method to check if Koko can finish in h hours at speed k
   private static boolean canFinish(int[] piles, int h, int k) {
       int hoursNeeded = 0;

       for (int pile : piles) {
           hoursNeeded += (int) Math.ceil((double) pile / k);
           if (hoursNeeded > h) {
               return false; // If more hours than allowed, return false
           }
       }
       return true;
   }

   // Helper method to get the maximum pile size
   private static int getMaxPile(int[] piles) {
       int max = 0;
       for (int pile : piles) {
           max = Math.max(max, pile);
       }
       return max;
   }
   public static void main(String[] args) {
    System.out.println(minEatingSpeed(new int[] {2,3,5,7,8}, 1));
   }
}
