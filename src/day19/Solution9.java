package day19;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution9 {

    public boolean canPartition(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if(sum%2==1){
            return false;
        }
        boolean[] dp = new boolean[sum/2+1];
        dp[0] = true;
        for (int i = 1; i < nums.length; i++) {
            for (int j = sum/2; j >= nums[i]; j--) {
                dp[j] = dp[j]||dp[j-nums[i]];
            }
        }
        return dp[sum/2];
    }
//    public boolean canPartition(int[] nums) {
//        int sum = Arrays.stream(nums).sum();
//        if(sum%2==1){
//            return false;
//        }
//        boolean[][] dp = new boolean[nums.length][sum];
//        dp[0][0] = true;
//        for (int i = 1; i < nums.length; i++) {
//            for (int j = 0; j <= sum/2; j++) {
//                if(dp[i-1][j]){
//                    dp[i][j] = true;
//                    continue;
//                }
//                if((j-nums[i])>=0&&dp[i-1][j-nums[i]]){
//                    dp[i][j] = true;
//                }
//            }
//        }
//        return dp[nums.length-1][sum/2];
//    }
}
