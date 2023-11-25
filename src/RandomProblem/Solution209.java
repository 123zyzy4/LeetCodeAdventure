package RandomProblem;

import org.testng.annotations.Test;

public class Solution209 {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0,right = 0;
        int sum = nums[0];
        int res = Integer.MAX_VALUE;
        while(left<=right){
            if(sum >= target){
                res = Math.min(res,right-left+1);
                sum -= nums[left];
                left++;
//                right++;
//                if(right == nums.length){
//                    break;
//                }
//                sum+=nums[right];
            }else{
                right++;
                if(right == nums.length){
                    break;
                }
                sum+=nums[right];
//                sum -= nums[left];
//                left++;

            }
        }
        return res==Integer.MAX_VALUE?0:res;
    }
    @Test
    private void test(){
        System.out.println(minSubArrayLen(7,new int[]{2,3,1,2,4,3}));
    }
}
