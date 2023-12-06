package RandomProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution40 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(new LinkedList<>(),target, candidates,  0);
        return res;

    }
    
    
    private void backtrack(LinkedList<Integer> tmp, int target, int[] candidates, int start) {
        // 子集和等于 target 时，记录解
        if (target == 0) {
            res.add(new ArrayList<>(tmp));
            return;
        }
        // 遍历所有选择
        // 剪枝二：从 start 开始遍历，避免生成重复子集
        // 剪枝三：从 start 开始遍历，避免重复选择同一元素
        for (int i = start; i < candidates.length; i++) {
            // 剪枝一：若子集和超过 target ，则直接结束循环
            // 这是因为数组已排序，后边元素更大，子集和一定超过 target
            if (target - candidates[i] < 0) {
                break;
            }
            // 剪枝四：如果该元素与左边元素相等，说明该搜索分支重复，直接跳过
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            // 尝试：做出选择，更新 target, start
            tmp.add(candidates[i]);
            // 进行下一轮选择
            backtrack(tmp, target - candidates[i], candidates, i + 1);
            // 回退：撤销选择，恢复到之前的状态
            tmp.removeLast();
        }
    }



}

