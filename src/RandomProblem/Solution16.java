package RandomProblem;

import java.util.Arrays;

public class Solution16 {
    //其实还可以做小优化，下面代码已经把重复元素给优化掉了
    //还可以把加上最小两个数和最大两个数得到的三数和和target的差值不能比当前min小给优化掉（时间会小很多）
     public int threeSumClosest(int[] nums, int target){
        Arrays.sort(nums);
        int len = nums.length;
        int res = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length-2; i++) {
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int left = i+1,right = len-1;
            
            while(left<right){
                int leftNum = nums[left],rightNum = nums[right];
                int sum = leftNum+rightNum+nums[i];
                if(sum==target){
                    return sum;
                }
                if(Math.abs(sum-target)<min){
                    min = Math.abs(sum-target);
                    res = sum;
                }
                if(sum<target){
                    
                    while(left<right&&nums[left]==leftNum){
                        left++;
                    }
                }else{
                    while(left<right&&nums[right]==rightNum){
                        right--;
                    }
                }
            }
    
        }
        return res;
     }



    //经典使用回溯遍历所有情况超时了
    // int min = Integer.MAX_VALUE;
    // int res;
    // public int threeSumClosest(int[] nums, int target) {
       
    //     backtrack(nums, target, 0, 0, new boolean[nums.length]);
    //     return res;


    // }

    // private void backtrack(int[] nums,int target,int sum,int i,boolean[] visit){
    //     if(i==3){
    //         if(Math.abs(sum-target)<min){
    //             min = Math.abs(sum-target);
    //             res = sum;
    //         }
    //         return;
    //     }
    //     for (int j = 0; j < nums.length; j++) {
            
    //         if(!visit[j]){
    //             visit[j] = true;
    //             backtrack(nums, target, sum+nums[j], i+1, visit);
    //             visit[j] = false;
    //         }
            
            
    //     }

    // }
    
}
