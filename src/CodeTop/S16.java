package CodeTop;

public class S16 {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE,res = 0;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(prices[i],min);
            res = Math.max(res,prices[i]-min);
        }
        return res;
    }
}
