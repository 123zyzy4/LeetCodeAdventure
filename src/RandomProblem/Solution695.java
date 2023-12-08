package RandomProblem;

public class Solution695 {

    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]==1){
                    max = Math.max(max,backtrack(grid,i,j));
                }
            }
        }
        return max;
    }

    private int backtrack(int[][] grid,int i,int j){
        if(i<0||j<0||i>= grid.length||j>=grid[0].length||grid[i][j]==0){
            return 0;
        }
        grid[i][j] = 0;
        int num = 1;
        num+=backtrack(grid, i, j-1);
        num+=backtrack(grid, i+1, j);
        num+=backtrack(grid, i, j+1);
        num+=backtrack(grid, i-1, j);
        return num;
    }


}
