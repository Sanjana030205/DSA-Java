package Arrays;

public class BuySellStock {
    public static int maxProfit(int[] prices) {
        int minimum = prices[0];
        int maxProfit = 0;
        for(int i = 1; i<prices.length; i++)
        {
            int profit = prices[i] - minimum;
            if(prices[i] < minimum)
            {
                minimum = prices[i];
            }
            if(profit > maxProfit)
            {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 4, 1, 5, 3, 6};
        
        int result = maxProfit(prices);
        System.out.println("Maximum Profit: " + result);
    }
}
