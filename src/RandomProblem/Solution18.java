package RandomProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        return nSum(nums,4,target,0);
    }

    private List<List<Integer>>  nSum(int[] nums,int n,long target,int start){
        List<List<Integer>> res = new ArrayList<>();
        if (n < 2 || n > nums.length)
            return res;
        if(n==2){
            int left = start,right = nums.length-1;

            while(left<right){
                int leftNum = nums[left],rightNum = nums[right];
                long sum = (long)leftNum+rightNum;

                if(sum==target){
                    if(sum ==Integer.MAX_VALUE||sum == Integer.MIN_VALUE){
                        continue;
                    }else {
                        res.add(new ArrayList<>(Arrays.asList(leftNum,rightNum)));
                    }

                    while(left<right&&nums[left]==leftNum){
                        left++;
                    }
                    while(left<right&&nums[right]==rightNum){
                        right--;
                    }
                }else if(sum>target){
                    while(left<right&&nums[right]==rightNum){
                        right--;
                    }
                }else {
                    while(left<right&&nums[left]==leftNum){
                        left++;
                    }
                }
            }
        }else {
            int i = start;
            while(i< nums.length){
                int curNum = nums[i];
                List<List<Integer>> previousRes = nSum(nums, n-1, target-curNum, i+1);
                for(List<Integer> list:previousRes){
                    list.add(curNum);
                    res.add(list);
                }
                while(i< nums.length&&nums[i]==curNum){
                    i++;
                }
            }
        }
        return res;
    }
}
