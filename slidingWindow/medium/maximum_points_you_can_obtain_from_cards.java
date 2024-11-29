package slidingWindow.medium;

public class maximum_points_you_can_obtain_from_cards {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
       int totalSum = 0;

       // Calculate the total sum of all card points
       for (int point : cardPoints) {
           totalSum += point;
       }

       // If k equals the total number of cards, return total sum
       if (k == n) return totalSum;

       // Find the minimum sum of a window of size (n - k)
       int windowSize = n - k;
       int windowSum = 0;

       // Calculate the sum of the first window
       for (int i = 0; i < windowSize; i++) {
           windowSum += cardPoints[i];
       }

       int minWindowSum = windowSum;

       // Slide the window across the array
       for (int i = windowSize; i < n; i++) {
           windowSum += cardPoints[i] - cardPoints[i - windowSize];
           minWindowSum = Math.min(minWindowSum, windowSum);
       }

       // Maximum score is the total sum minus the minimum window sum
       return totalSum - minWindowSum;
   }
}