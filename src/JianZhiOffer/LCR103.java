package JianZhiOffer;

import java.util.Arrays;

public class LCR103 {
//    public int coinChange(int[] coins, int amount) {
//        int max = amount + 1;
//        int[] dp = new int[amount + 1];
//        Arrays.fill(dp, max);
//        dp[0] = 0;
//        for (int i = 1; i <= amount; i++) {
//            for (int j = 0; j < coins.length; j++) {
//                if (coins[j] <= i) {
//                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
//                }
//            }
//        }
//
//        return dp[amount] > amount ? -1 : dp[amount];
//    }

    public int coinChange(int[] coins, int amount) {
        int INFINITY = amount+1;
        int n = coins.length;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, INFINITY);
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = amount; j >= 0; j--) {
                int minCoins = INFINITY;
                int maxCount = j / coins[i - 1];
                for (int k = 0; k <= maxCount; k++) {
                    minCoins = Math.min(minCoins, dp[j - coins[i - 1] * k] + k);
                }
                dp[j] = minCoins;
            }
        }
        return dp[amount] != INFINITY ? dp[amount] : -1;
    }
}


