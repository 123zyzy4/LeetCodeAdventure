package day19;

public class Solution1 {
//    public int climbStairs(int n) {
//        int[] dp = new int[n+1];
//        dp[0] = 1;
//        dp[1] = 1;
//        for (int i = 2; i <= n; i++) {
//            dp[i] = dp[i-1]+dp[i-2];
//        }
//        return dp[n];
//    }

    public int climbStairs(int n) {
        int dp1 = 1,dp2 = 1;
        int dp = 1;

        for (int i = 2; i <= n; i++) {
            dp = dp1+dp2;
            dp2 = dp1;
            dp1 = dp;
        }
        return dp;
    }
}
