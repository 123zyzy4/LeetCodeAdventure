package CodeTop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class S17 {
    List<List<Integer>> res;
    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        backtrack(nums,new LinkedList<>(),new boolean[nums.length]);
        return res;
    }
    private void backtrack(int[] nums, LinkedList<Integer> tmp,boolean[] visited){
        if(tmp.size()== nums.length){
            res.add(new LinkedList<>(tmp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if(visited[i]){
                continue;
            }
            visited[i] = true;
            tmp.add(nums[i]);
            backtrack(nums,tmp,visited);
            visited[i] = false;
            tmp.removeLast();


        }

    }
    private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
