package Hot100.day15;

public class Solution3 {
    public int[] searchRange(int[] nums, int target) {
        int left =0,right = nums.length-1;
        boolean flag = false;
        int pos = 0;
        while(left<=right){
            if(nums[(left+right)/2]==target){
                flag = true;
                pos = (left+right)/2;
                break;

            }else if(nums[(left+right)/2]<target){
                left = (left+right)/2+1;
            }else {
                right = (left+right)/2-1;
            }
        }
        if(flag == false){
            return new int[]{-1,-1};
        }
        left = pos;
        right = pos;
        while(left>=0&&nums[left]==target){
            left--;
        }
        while(right<= nums.length-1&&nums[right]==target){
            right++;
        }
        return new int[]{left+1,right-1};


    }
}
