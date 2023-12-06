package RandomProblem;

import org.testng.annotations.Test;

public class Solution213 {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        int[] dp = new int[nums.length];
        int res = 0;
        boolean flag = true;
        for (int i = 0; i < 2; i++) {
            dp[0] = flag?nums[0]:0;
            dp[1] = flag?Math.max(nums[1],dp[0]):nums[1];
            for (int j = 2; j < nums.length-1; j++) {
                dp[j] = Math.max(dp[j-1],dp[j-2]+nums[j]);
            }
            dp[nums.length-1] = flag?dp[nums.length-2]:Math.max(dp[nums.length-2],dp[nums.length-3]+nums[nums.length-1]);
            res = Math.max(res,dp[nums.length-1]);
            flag = false;
        }
        return res;
    }

    @Test
    private void test(){
        int res = rob(new int[]{1,2,3,1});
        System.out.println(res);
    }
}
