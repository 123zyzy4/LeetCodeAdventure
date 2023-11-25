package Hot100.day14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution1 {
    List<List<Integer>> res= new ArrayList<>();;
    public List<List<Integer>> permute(int[] nums) {
//        res = new ArrayList<>();
        backtrack(nums,new boolean[nums.length],new LinkedList<>());
        return res;
    }

    private void backtrack(int[] nums,boolean[] flags,LinkedList<Integer> tmp){
        if(tmp.size()== nums.length){
            res.add(new LinkedList<>(tmp));
//            res.add(tmp);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(flags[i]){
                continue;
            }
            flags[i] = true;
            tmp.add(nums[i]);
            backtrack(nums, flags, tmp);
            flags[i] = false;
            tmp.removeLast();

        }
    }
}
