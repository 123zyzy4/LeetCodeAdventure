package Hot100.day19;

public class Solution7 {
    public int lengthOfLIS(int[] nums){
        int[] lis = new int[nums.length];
        int res = 0;

        for (int num:nums) {
            //这里二分查找不可能出现mid = res的情况，出现了就出循环了
            int left = 0,right = res;
            while(left<right){
                int mid = (left+right)/2;
                if(lis[mid]<num){
                    left = mid+1;
                }else {
                    right = mid;
                }
            }
            lis[left] = num;
            if(res==left){
                res++;
            }
        }
        return res;
    }


    //还可以使用二分查找，但是感觉不是优化了是完全不同的思路了
//    public int lengthOfLIS(int[] nums) {
//        int[] dp = new int[nums.length];
//        dp[0] = 1;
//        int res = 1;
//        for (int i = 1; i < nums.length; i++) {
//            int max = 1;
//            for (int j = 0; j < i; j++) {
//                if(nums[j]<nums[i]){
//                    max=Math.max(max,dp[j]+1);
//                }
//            }
//            dp[i] = max;
//            res = Math.max(res,dp[i]);
//        }
//        return res;
//
//    }
}
