package RandomProblem;

import org.testng.annotations.Test;
import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution90 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrack(nums,0,new LinkedList<>());
        return res;
    }
    private void backtrack(int[] nums, int i, LinkedList<Integer> tmp){
        if(i== nums.length){
            res.add(new LinkedList<>(tmp));
            return;
        }
        int right = i;
        while(right< nums.length&&nums[right]==nums[i]){
            right++;
        }
        for (int j = 0; j <= right-i; j++) {
            for (int k = 0; k < j; k++) {
                tmp.add(nums[i]);
            }
            backtrack(nums, right, tmp);
            for (int k = 0; k < j; k++) {
                tmp.removeLast();
            }
        }
    }

    @Test
    public void test(){
        subsetsWithDup(new int[]{1,2,2});
    }
}
