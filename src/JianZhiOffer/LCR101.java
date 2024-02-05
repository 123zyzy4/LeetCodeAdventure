package JianZhiOffer;

import org.testng.annotations.Test;

public class LCR101 {
//    public boolean canPartition(int[] nums) {
//        if(nums.length<2){
//            return false;
//        }
//        int sum = 0,max = 0;
//        for (int num : nums) {
//            max = Math.max(max,num);
//            sum+=num;
//        }
//
//        if(sum%2!=0){
//            return false;
//        }
//        int target = sum/2;
//        if(max>target){
//            return false;
//        }
//        boolean[][] dp = new boolean[nums.length][target+1];
//        for (int i = 0; i < nums.length; i++) {
//            dp[i][0] = true;
//        }
//        dp[0][nums[0]] = true;
//
//
//        for (int i = 1; i < nums.length; i++) {
//            for (int j = 1; j <= target; j++) {
//                if(j>=nums[i]){
//                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i]];
//                }else {
//                    dp[i][j] = dp[i-1][j];
//                }
//
//            }
//        }
//        return dp[nums.length-1][target];
//    }


    public boolean canPartition(int[] nums) {
        if(nums.length<2){
            return false;
        }
        int sum = 0,max = 0;
        for (int num : nums) {
            max = Math.max(max,num);
            sum+=num;
        }

        if(sum%2!=0){
            return false;
        }
        int target = sum/2;
        if(max>target){
            return false;
        }
        boolean[] dp = new boolean[target+1];

        dp[nums[0]] = true;


        for (int i = 1; i < nums.length; i++) {
            for (int j = target; j >= nums[i]; j--) {
                // if(j>=nums[i]){
                //     dp[j] = dp[j] || dp[j-nums[i]];
                // }
                dp[j] = dp[j] || dp[j-nums[i]];

            }
        }
        return dp[target];
    }
    @Test
    public void test(){
        canPartition(new int[]{9,5});
    }

}
