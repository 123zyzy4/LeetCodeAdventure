package day6;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName Solution1
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/27 7:35
 * @Version 1.0
 */
public class Solution1 {
    //通过了
//    public int firstMissingPositive(int[] nums) {
//        if(nums.length==0||nums==null){
//            return 1;
//        }
//        Arrays.sort(nums);
//        int i=0;
//        while(i<nums.length&&nums[i]<=0){
//            i++;
//        }
//        if(i== nums.length){
//            return 1;
//        }else {
//            int j=1;
//            while(i<nums.length-1&&nums[i+1]==nums[i]){
//                i++;
//            }
//            while(i<nums.length&&nums[i]==j){
//
//                i++;
//                j++;
//                while(i<nums.length-1&&nums[i+1]==nums[i]){
//                    i++;
//                }
//            }
//            return j;
//        }
//
//    }



//    public int firstMissingPositive(int[] nums){
//        Set<Integer> set=new HashSet<>();
//        for (int num : nums) {
//            set.add(num);
//        }
//
//        int i=1;
//        while(set.contains(i)){
//            i++;
//        }
//        return i;
//    }

    public int firstMissingPositive(int[] nums){
        int length=nums.length;
        for (int i = 0; i < length; i++) {
            while(nums[i]>0&&nums[i]<=length&&nums[nums[i]-1]!=nums[i]){
                int temp=nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=temp;
            }
        }

        for (int i = 0; i < length; i++) {
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return length+1;
    }
}
