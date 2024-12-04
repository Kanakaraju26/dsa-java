package heap.hard;

public class rod_cutting {
    public int cutRod(int[] price) {
        // code here
        int n = price.length;
        int[] dp = new int[n + 1];

        // Build the dp array
        for (int i = 1; i <= n; i++) {
            int maxVal = 0;
            for (int j = 1; j <= i; j++) {
                maxVal = Math.max(maxVal, price[j - 1] + dp[i - j]);
            }
            dp[i] = maxVal;
        }

        return dp[n];
    }
}
