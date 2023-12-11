package RandomProblem;

public class Solution80 {
    public int removeDuplicates(int[] nums) {
        int index = 0,count = 0,left = 0;
        while(index<nums.length){
            int target = nums[index],i = index;
            while(i<nums.length&&nums[i]==target){
                i++;
            }
            if((i-index)>=2){
                nums[left] = target;
                nums[left+1] = target;
                left+=2;
                count+=2;
            }else if((i-index)==1){
                nums[left] = target;
                left++;
                count++;
            }else {
                throw new RuntimeException("error");
            }
            index = i;

        }
        return count;
    }

    //失败做法
//    public int removeDuplicates(int[] nums) {
//        int left = 0,right = 0;
//        while(right<nums.length){
//            while(right+1<nums.length&&nums[right]==nums[right+1]){
//                right++;
//            }
//            nums[left] = nums[right];
//            left++;
//        }
//        return left;
//    }
}
