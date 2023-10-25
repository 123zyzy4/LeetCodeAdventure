package day2;

/**
 * @ClassName day13.Solution1
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/15 7:13
 * @Version 1.0
 */
public class Solution1 {
//    public void moveZeroes(int[] nums) {
//        if(nums==null||nums.length==0)return;
//        int i=0,j=1;
//        while (j< nums.length){
//            if(nums[i]==0&&nums[j]!=0){
//                int tmp=nums[i];
//                nums[i]=nums[j];
//                nums[j]=tmp;
//                i++;
//            }else if(nums[i]!=0){
//                i++;
//            }
//            j++;
//        }
//        return;
//
//    }
    public void moveZeroes(int[] nums){
        if(nums==null||nums.length==0)return;
        int i=0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=0){
                if(j>i){
                    nums[i]=nums[j];
                    nums[j]=0;
                }
                i++;
            }

        }
    }


}
