package Hot100.day1;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @ClassName day13.Solution1
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/13 14:35
 * @Version 1.0
 */
public class Solution1 {
    public static int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length&&j!=i; j++) {
//                if(nums[i]+nums[j]==target){
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return new int[0];

        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[0];
    }
}
