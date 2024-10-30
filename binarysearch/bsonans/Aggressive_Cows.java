package binarysearch.bsonans;

import java.util.Arrays;

public class Aggressive_Cows {
    public static boolean canWePlace(int[] stalls, int dist, int cows) {
        int n = stalls.length; //size of array
        int cntCows = 1; //no. of cows placed
        int last = stalls[0]; //position of last placed cow.
        for (int i = 1; i < n; i++) {
            if (stalls[i] - last >= dist) {
                cntCows++; //place next cow.
                last = stalls[i]; //update the last location.
            }
            if (cntCows >= cows) return true;
        }
        return false;
    }
    public static int aggressiveCows(int[] stalls, int k) {
        int n = stalls.length; //size of array
        //sort the stalls[]:
        Arrays.sort(stalls);

        int limit = stalls[n - 1] - stalls[0];
        for (int i = 1; i <= limit; i++) {
            if (canWePlace(stalls, i, k) == false) {
                return (i - 1);
            }
        }
        return limit;
    }
    public static void main(String[] args) {
        System.out.println(aggressiveCows(new int[]{1,4,5,9}, 5));
    }
}
