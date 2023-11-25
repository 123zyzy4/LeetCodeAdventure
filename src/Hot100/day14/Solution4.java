package Hot100.day14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution4 {
    //剪枝见文档
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates.length==0)return res;
        backtrack(candidates,new LinkedList<>(),target,0,0);
        return res;
    }



    private void backtrack(int[] candidates,LinkedList<Integer> tmp,int target,int sum,int begin){
        if(sum== target){
            res.add(new LinkedList<>(tmp));
            return;
        }
        if(sum>target){
            return;
        }
        for (int i = begin; i < candidates.length; i++) {
            sum+=candidates[i];
            tmp.add(candidates[i]);
            backtrack(candidates, tmp,target,sum,i);
            sum-=candidates[i];
            tmp.removeLast();
        }



    }
}
