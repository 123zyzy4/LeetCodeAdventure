package RandomProblem;

import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;

public class Solution47 {

    //还得试试逐位固定的方法，visit确实有点土味
    List<Integer> nums;
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {

        this.nums = Arrays.stream(nums).boxed().collect(Collectors.toList());
        backtrack(this.nums ,0,new LinkedList<>());
        return res;
    }
    private void swap(List<Integer> nums,int i,int j){
        int tmp = nums.get(i);
        nums.set(i,nums.get(j)) ;
        nums.set(j,tmp);
    }
    private void backtrack(List<Integer> nums,int i,LinkedList<Integer> tmp){
        if(i== nums.size()){
            res.add(new ArrayList<>(nums));
            return;
        }

        HashSet<Integer> set = new HashSet<>();
        for (int j = i; j < nums.size(); j++) {
            if(set.contains(nums.get(j))){
                continue;
            }

            set.add(nums.get(j));
            swap(nums,i,j);
            backtrack(nums,i+1,tmp);

            swap(nums,i,j);


        }
    }
//    private void backtrack(int[] nums,LinkedList<Integer> tmp,boolean[] visit){
//        if(tmp.size()== nums.length){
//            res.add(new LinkedList<>(tmp));
//            return;
//        }
//
//        HashSet<Integer> set = new HashSet<>();
//        for (int j = 0; j < nums.length; j++) {
//            if(set.contains(nums[j])||visit[j]){
//                continue;
//            }
//            tmp.add(nums[j]);
//            set.add(nums[j]);
//            visit[j] =true;
//            backtrack(nums, tmp, visit);
//            tmp.removeLast();
//            visit[j] =false;
//
//        }
//    }
    @Test
    private void test(){
        permuteUnique(new int[]{1,2,2,3,3});
    }
}
