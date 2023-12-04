package RandomProblem;

import org.testng.annotations.Test;

public class Solution63 {

    public int uniquePathsWithObstacles(int[][] obstacleGrid){
        if(obstacleGrid[0][0]==1){
            return 0;
        }
        int[] dp = new int[obstacleGrid[0].length];
        if(obstacleGrid[0][0]!=1){
            dp[0] = 1;
        }


        for (int i = 0; i < obstacleGrid.length; i++) {
            for (int j = 0; j < obstacleGrid[0].length; j++) {
                if(obstacleGrid[i][j]==1){
                    dp[j] = 0;
                }else if(j>=1){
                    dp[j] =  dp[j-1]+dp[j];
                }

            }
        }
        return dp[obstacleGrid[0].length-1];
    }
//    public int uniquePathsWithObstacles(int[][] obstacleGrid){
//        if(obstacleGrid[0][0]==1){
//            return 0;
//        }
//        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
//        if(obstacleGrid[0][0]!=1){
//            dp[0][0] = 1;
//        }
//        boolean flag = false;
//        for(int i = 1;i<obstacleGrid.length;i++){
//            if(obstacleGrid[i][0]==1){
//                flag = true;
//            }
//            if(!flag){
//                dp[i][0] = 1;
//            }
//
//        }
//        flag = false;
//        for(int i = 1;i<obstacleGrid[0].length;i++){
//            if(obstacleGrid[0][i]==1){
//                flag = true;
//            }
//            if(!flag){
//                dp[0][i] = 1;
//            }
//
//        }
//        for (int i = 1; i < obstacleGrid.length; i++) {
//            for (int j = 1; j < obstacleGrid[0].length; j++) {
//                if(obstacleGrid[i][j]==1){
//                    dp[i][j] = 0;
//                }else{
//                    dp[i][j] =  dp[i-1][j]+dp[i][j-1];
//                }
//
//            }
//        }
//        return dp[obstacleGrid.length-1][obstacleGrid[0].length-1];
//    }

    @Test
    private void test(){
        int[][] matrix = { {0, 1}, {0, 0} };
        uniquePathsWithObstacles(matrix);
    }
    //递归可以做但是超时了。。
//    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
//        int m = obstacleGrid.length;
//        int n = obstacleGrid[0].length;
//
//        return countPaths(obstacleGrid, 0, 0, m, n);
//    }
//
//    private int countPaths(int[][] obstacleGrid, int x, int y, int m, int n) {
//
//        if (obstacleGrid[x][y] == 1) {
//            return 0;
//        }
//
//        if (x == m - 1 && y == n - 1) {
//            return 1;
//        }
//        int right = (y + 1 < n) ? countPaths(obstacleGrid, x, y + 1, m, n) : 0;
//        int down = (x + 1 < m) ? countPaths(obstacleGrid, x + 1, y, m, n) : 0;
//        return right + down;
//    }
}
