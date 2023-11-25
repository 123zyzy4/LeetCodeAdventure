package Hot100.day20;

public class Solution1 {


    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        dp[0][0] = 0;
        for (int i = 1; i < n; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            dp[i][m] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }


    //回溯超时了
//    public int uniquePaths(int m, int n) {
//        return backtrack(0, 0, m, n);
//    }
//
//    private int backtrack(int row, int col, int m, int n) {
//        if (row == m - 1 && col == n - 1) {
//            return 1;
//        }
//
//        if (row >= m || col >= n) {
//            return 0;
//        }
//
//
//        return backtrack(row + 1, col, m, n) + backtrack(row, col + 1, m, n);
//    }
}
