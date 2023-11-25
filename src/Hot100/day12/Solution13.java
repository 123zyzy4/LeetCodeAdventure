package Hot100.day12;

import java.util.HashMap;
import java.util.Map;

public class Solution13 {
    public int pathSum(TreeNode root, int targetSum) {
        Map<Long,Integer> prefix = new HashMap<>();
        prefix.put(0L,1);
        return calculate(root,prefix,targetSum,0L);
    }

    private int calculate(TreeNode root,Map<Long,Integer> prefix,int targetSum,Long cur){
        if(root==null)return 0;
        int res = 0;
        cur += root.val;
        res+=prefix.getOrDefault(cur-targetSum,0);
        prefix.put(cur,prefix.getOrDefault(cur,0));
        res+=calculate(root.left, prefix, targetSum, cur);
        res+=calculate(root.right, prefix, targetSum, cur);
        prefix.put(cur,prefix.get(cur)-1);
        return res;


    }
}
