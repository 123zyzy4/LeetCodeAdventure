package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName Solution3
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/15 8:33
 * @Version 1.0
 */
public class Solution3 {
    //错误解法
//    public List<List<Integer>> threeSum(int[] nums) {
//        if(nums==null||nums.length==0)return null;
//
//        List<List<Integer>> result=new ArrayList<>();
//        Arrays.sort(nums);
//        int i=0,j=1;
//        int right=nums.length-1;
//
//        while(nums[i]<=0&&j<right){
//            while(nums[i]+nums[j]+nums[right]<0){
//                j++;
//            }
//            while (right>j){
//                if(nums[i]+nums[j]+nums[right]==0){
//                    List arrayList = new ArrayList<Integer>(Arrays.asList(nums[i], nums[j], nums[right]));
//                    result.add(arrayList);
//
//                }
//                right--;
//            }
//            i++;
//            j=i+1;
//            right=nums.length-1;
//        }
//        return result;
//    }

//还是错的
//    public List<List<Integer>> threeSum(int[] nums) {
//        if(nums==null||nums.length==0)return null;
//
//        List<List<Integer>> result=new ArrayList<>();
//        Arrays.sort(nums);
//        int k=0;
//        int left=k+1,right= nums.length-1;
//        while (k< nums.length&&nums[k]<=0){
//            if(k>0&&nums[k]==nums[k-1]){
//                k++;
//                break;
//            }
//            while (left<right){
//                int sum=nums[k]+nums[left]+nums[right];
//                if(sum<0) {
//                    left++;
//                }else if(sum>0){
//                    right--;
//                }else {
//                    result.add(new ArrayList<Integer>(Arrays.asList(nums[k], nums[left], nums[right])));
//                    left++;
//                    right--;
//                    continue;
//                }
//
//            }
//            k++;
//            left=k+1;
//            right=nums.length-1;
//        }
//        return result;
//    }


    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null||nums.length==0)return null;

        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);


        for (int k = 0; k < nums.length-2; k++) {
            if(nums[k]>0)break;
            if(k>0&&nums[k]==nums[k-1])continue;

            int left=k+1,right= nums.length-1;
            while (left<right){
                int sum=nums[k]+nums[left]+nums[right];

                if(sum>0){
                    while (left<right&&nums[right]==nums[--right]);
                }else if(sum<0){
                    while (left<right&&nums[left]==nums[++left]);
                }else {
                    result.add(new ArrayList<Integer>(Arrays.asList(nums[k], nums[left], nums[right])));
                    while (left<right&&nums[left]==nums[++left]);
                    while (left<right&&nums[right]==nums[--right]);
                }
            }
        }
        return result;
    }
}
