package JianZhiOffer;

import org.testng.annotations.Test;

public class LCR104 {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if (num <= i) {
                    dp[i] += dp[i - num];
                }
            }
        }
        return dp[target];
    }

     @Test
     private void test(){
//        int res = combinationSum4(new int[]{3,4,5,6},1);
//         System.out.println(res);
         int res = combinationSum4(new int[]{1,2,3},4);
         System.out.println(res);
     }
}
