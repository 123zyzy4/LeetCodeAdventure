package Hot100.day21;

import java.util.ArrayList;
import java.util.List;

public class Solution4 {

    public void nextPermutation(int[] nums) {
        int minIndex = -1;
        for (int i = nums.length-2; i >=0 ; i--) {

            int min = Integer.MAX_VALUE;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j]>nums[i]&&nums[j]<=min){
                    min = nums[j];
                    minIndex = j;
                }

            }
            if(minIndex!=-1){
                swap(nums,i,minIndex);
                reverse(nums, i + 1);
                return;
            }
        }
        if(minIndex==-1){
            reverse(nums,0);
        }
    }
    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    private void reverse(int[] nums, int start) {
        int left = start, right = nums.length - 1;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }


}
