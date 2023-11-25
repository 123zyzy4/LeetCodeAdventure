package Hot100.day14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution2 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {

        backtrack(nums,new LinkedList<>(),0);
        return res;
    }

    private void backtrack(int[] nums,LinkedList<Integer> tmp,int i){
        if(i== nums.length){
            res.add(new LinkedList<>(tmp));
            return;
        }
        tmp.add(nums[i]);
        backtrack(nums, tmp,i+1);
        tmp.removeLast();
        backtrack(nums, tmp,i+1);

    }
}
