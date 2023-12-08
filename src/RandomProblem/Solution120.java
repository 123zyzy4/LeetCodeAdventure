package RandomProblem;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution120 {
    public int minimumTotal(List<List<Integer>> triangle){

        int len = triangle.size();
        int[] dp = new int[len];
        dp[0] = triangle.get(0).get(0);
        for (int i = 1; i <len; i++) {
            dp[i] = dp[i-1]+triangle.get(i).get(i);
            for (int j = i-1; j >=1 ; j--) {
                dp[j] = Math.min(dp[j],dp[j-1])+triangle.get(i).get(j);
            }
            dp[0] = dp[0]+triangle.get(i).get(0);


        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {
            min = Math.min(min,dp[i]);
        }
        return min;
    }

    //好稳定的回溯算法超时啊
//    int min = Integer.MAX_VALUE;
//    public int minimumTotal(List<List<Integer>> triangle) {
//        backtrack(triangle,0,0,0);
//        return min;
//    }
//    private void backtrack(List<List<Integer>> triangle,int i,int j,int sum){
//        if(i==triangle.size()-1){
//            sum+=triangle.get(i).get(j);
//            min = Math.min(min,sum);
//            return;
//        }
//
//        backtrack(triangle,i+1,j,sum+triangle.get(i).get(j));
//
//        if(j<=triangle.get(i+1).size()-2){
//            backtrack(triangle,i+1,j+1,sum+triangle.get(i).get(j));
//        }
//
//        return;
//
//    }

    @Test
    private void test(){
        List<List<Integer>> triangle1 = new ArrayList<>();
        triangle1.add(Arrays.asList(2));
        triangle1.add(Arrays.asList(3, 4));
//        triangle1.add(Arrays.asList(6, 5, 7));
//        triangle1.add(Arrays.asList(4, 1, 8, 3));
        int res = minimumTotal(triangle1);
        System.out.println(res);
    }
}
