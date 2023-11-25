package Hot100.day19;

import java.util.Arrays;

public class Solution4 {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,n+1);

        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= (int)Math.sqrt(n); j++) {
//                if(i>=j*j){
//                    dp[i] = Math.min(dp[i],dp[i-j*j]+1);
//                }
//
//            }
            for (int j = 1; j*j <= i; j++) {
                dp[i] = Math.min(dp[i],dp[i-j*j]+1);

           }

        }
        return dp[n]==n+1?-1:dp[n];
    }
}
