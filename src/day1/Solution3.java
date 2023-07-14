package day1;

import java.util.*;

/**
 * @ClassName Solution3
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/14 12:28
 * @Version 1.0
 */
public class Solution3 {
    //时间复杂度超标
//    public int longestConsecutive(int[] nums) {
//        Map<Integer,Boolean> map=new HashMap<>();
//        for (int num : nums) {
//            map.put(num,true);
//        }
//        int max=0;
//        for (int num : nums) {
//            int target=num;
//            int cur=1;
//            while(map.containsKey(--target)){
//                cur++;
//            }
//            target=num;
//            while(map.containsKey(++target)){
//                cur++;
//            }
//            if(cur>max){
//                max=cur;
//            }
//        }
//        return max;
//    }


//    public int longestConsecutive(int[] nums) {
//
//        if(nums.length==0){
//            return 0;
//        }
//
//        Arrays.sort(nums);
//        int max=1;
//        int cur=1;
//        for (int i = 0; i < nums.length-1; i++) {
//            if(nums[i+1]-nums[i]==1){
//                cur++;
//            }else if(nums[i+1]-nums[i]==0){
//                continue;
//            }else {
//                max=Math.max(max,cur);
//                cur=1;
//            }
//        }
//        max=Math.max(max,cur);
//        return max;
//    }


//    public int longestConsecutive(int[] nums) {
//        Set<Integer> set=new HashSet<>();
//        for (int num : nums) {
//            set.add(num);
//        }
//        int max=0;
//        for (int num : nums) {
//            int target=num;
//            int cur=1;
//            if(!set.contains(num-1)){
//                while(set.contains(++target)){
//                    cur++;
//                }
//            }
//
//
//            if(cur>max){
//                max=cur;
//            }
//        }
//        return max;
//    }
    public int longestConsecutive(int[] nums){
        Map<Integer,Integer> map=new HashMap<>();
        int max=0;
        for (int num : nums) {
            int cur=1;
            if(!map.containsKey(num)){
                int left=map.getOrDefault(num-1,0);
                int right=map.getOrDefault(num+1,0);
                cur=left+right+1;

                if(cur>max){
                    max=cur;
                }

                map.put(num,-1);
                map.put(num-left,cur);
                map.put(num+right,cur);
            }
        }
        return max;
    }

}
