package CodeTop;

public class S6 {
    public int maxSubArray(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        int res = Integer.MIN_VALUE;
        int dp = 0;
        for (int i = 0; i < nums.length; i++) {
            dp = Math.max(dp+nums[i],nums[i]);
            res = Math.max(res,dp);
        }
        return res;

    }
}
