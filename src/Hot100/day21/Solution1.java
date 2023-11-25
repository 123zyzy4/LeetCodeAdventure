package Hot100.day21;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {

    //使用异或使得空间复杂度为常数
    //因为题目中限定了非单独数字一定出现两次，而非多次，第一次第二次异或完就没了，出现一次的数字留了下来
    public int singleNumber(int[] nums) {
        int ans = nums[0];
        if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                ans = ans ^ nums[i];
            }
        }
        return ans;



    }
    //可以但是空间复杂度不符合要求
//    public int singleNumber(int[] nums) {
//        Map<Integer,Integer> map = new HashMap<>();
//        for(int num:nums){
//            map.put(num,map.getOrDefault(num,0)+1);
//        }
//        for(Map.Entry entry: map.entrySet()){
//            if((int)entry.getValue()==1){
//                return (int)entry.getKey();
//            }
//        }
//        return -1;
//
//    }
}
