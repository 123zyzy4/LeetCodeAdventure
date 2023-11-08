package day15;

public class Solution5 {


    //这是自己写的版本有点复杂，题解版本更简单
    public int findMin(int[] nums) {
        int left =0,right = nums.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(mid+1== nums.length){
                return nums[0];
            }
            if(nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }

            if(nums[mid]>nums[left]){
                left = mid+1;

            }else if(nums[mid]<nums[left]){
                right = mid-1;
            }else {
                if(mid == left){
                    left = mid+1;
                }else {
                    right = mid-1;
                }
            }


        }
        return nums[left];
    }


    //题解版本
//    public int findMin(int[] nums) {
//        int low = 0;
//        int high = nums.length - 1;
//        while (low < high) {
//            int pivot =  (high + low) / 2;
//            if (nums[pivot] < nums[high]) {
//                high = pivot;
//            } else {
//                low = pivot + 1;
//            }
//        }
//        return nums[low];
//
//    }
}
