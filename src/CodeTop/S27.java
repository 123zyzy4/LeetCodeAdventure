package CodeTop;

public class S27 {
//    public int lengthOfLIS(int[] nums) {
//        int res = 0;
//        int[] dp = new int[nums.length];
//        dp[0] = 1;
//        for (int i = 1; i < nums.length; i++) {
//            int max = 0;
//            for (int j = 0; j < i; j++) {
//                if(nums[j]<=nums[i]){
//                    max = Math.max(max,dp[j]);
//                }
//            }
//            dp[i] = max+1;
//            res = Math.max(dp[i],res);
//        }
//        return res;
//    }
    public int lengthOfLIS(int[] nums) {
        int[] d = new int[nums.length+1];
        int len = 1;
        d[len] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if(nums[i]>d[len]){
                d[++len] = nums[i];
            }else {
                int left = 1,right = len;
                while(left<right){
                    int mid = (left+right)/2;
                    if(d[mid]<nums[i]){
                        left = mid+1;
                    }else {
                        right = mid;
                    }
                }
                d[left] = nums[i];

            }
        }
        return len;
    }
}
