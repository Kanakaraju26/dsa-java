package binarysearch.bsonans;

public class Minimize_Max_Distance_to_Gas_Station {
    public static int numberOfGasStationsRequired(double dist, int[] arr) {

        int n = arr.length; // size of the array

        int cnt = 0;

        for (int i = 1; i < n; i++) {

            int numberInBetween = (int) ((arr[i] - arr[i - 1]) / dist);

            if ((arr[i] - arr[i - 1]) == (dist * numberInBetween)) {

                numberInBetween--;

            }

            cnt += numberInBetween;

        }

        return cnt;

    }

    public static double MinimiseMaxDistance(int[] arr, int k) {

        // Write your code here.

        int n = arr.length; // size of the array

        double low = 0;

        double high = 0;

        // Find the maximum distance:

        for (int i = 0; i < n - 1; i++) {

            high = Math.max(high, (double) (arr[i + 1] - arr[i]));

        }

        // Apply Binary search:

        double diff = 1e-6;

        while (high - low > diff) {

            double mid = (low + high) / (2.0);

            int cnt = numberOfGasStationsRequired(mid, arr);

            if (cnt > k) {

                low = mid;

            } else {

                high = mid;

            }

        }

        return high;

    }

    public static void main(String[] args) {
        System.out.println(numberOfGasStationsRequired(3, new int[]{2,3,4,6,7,8,9}));
    }
}
