package medium;

public class Best_Time_to_Buy_and_Sell_Stock {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int profit = prices[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        
        return maxProfit;
    }
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] {3,2,5,1,5,1,6}));
    }
}
