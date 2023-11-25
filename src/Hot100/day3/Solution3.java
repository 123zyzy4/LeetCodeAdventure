package Hot100.day3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Solution3
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/17 9:35
 * @Version 1.0
 */
public class Solution3 {

    //在重复数字的时候有问题，通过了33/90个用例
//    public int subarraySum(int[] nums, int k) {
//
//        if(nums==null||nums.length==0)return 0;
//        Arrays.sort(nums);
//        int left=0,right=0;
//        int cur=nums[0];
//        int result=0;
//        while(left<=right&&right< nums.length){
//            if(cur==k) {
//                result++;
//
//                right++;
//                if(right< nums.length){
//                    cur+=nums[right];
//                }else {
//                    return result;
//                }
//
//            }
//            if(cur<k){
//                right++;
//                if(right< nums.length){
//                    cur+=nums[right];
//                }else {
//                    return result;
//                }
//            }else {
//                left++;
//                cur-=nums[left-1];
//            }
//        }
//        return result;
//    }


//    public int subarraySum(int[] nums, int k) {
//
//        if(nums==null||nums.length==0)return 0;
//        Arrays.sort(nums);
//        int left=0,right=0;
//        int cur=nums[0];
//        int result=0;
//        for (int i = 0; i < nums.length; i++) {
//            cur=0;
//            for (int j = i; j < nums.length; j++) {
//                cur+=nums[j];
//                if(cur==k)result++;
//            }
//        }
//        return result;
//    }

    public int subarraySum(int[] nums, int k){
        if(nums==null||nums.length==0)return 0;

        int result = 0;
        int pre=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for (int i = 0; i < nums.length; i++) {
            pre+=nums[i];
            if(map.containsKey(pre-k)){
                result+=map.get(pre-k);
            }
            map.put(pre,map.getOrDefault(pre,0)+1);
        }
        return result;
    }

}
