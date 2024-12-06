package Greedy.easy;

import java.util.Arrays;

public class number_of_coins {
    public int minCoins(int coins[], int sum) {
        // Your code goes here
        if(sum==0) return 0;
         int[] dp = new int[sum + 1];

        // Fill dp array with a large value (representing infinity for this problem).
        Arrays.fill(dp, Integer.MAX_VALUE);
        
        // Base case: 0 coins are required to make a sum of 0.
        dp[0] = 0;

        // Iterate through each amount from 1 to sum.
        for (int i = 1; i <= sum; i++) {
            // Iterate through each coin denomination.
            for (int coin : coins) {
                if (i - coin >= 0 && dp[i - coin] != Integer.MAX_VALUE) {
                    // Update dp[i] if a smaller number of coins can make the current sum.
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        // If dp[sum] is still Integer.MAX_VALUE, it means it's not possible to form the sum sum.
        return dp[sum] == Integer.MAX_VALUE ? -1 : dp[sum];
    }
}
