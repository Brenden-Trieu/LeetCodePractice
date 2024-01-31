package BuySell;

public class BuySell {
    public int maxProfit(int[] prices) {
        int max = 0, min = 0;
        for (int i = 0; i < prices.length; i++) {
            min = prices[i] < prices[min] ? i : min;
        }
        max = min;
        if (min == prices.length - 1) {
            return 0;
        } else {
            for (int i = min; i < prices.length; i++) {
                max = prices[i] > prices[max] ? i : max;
            }

            return prices[max] - prices[min];
        }

    }
}
