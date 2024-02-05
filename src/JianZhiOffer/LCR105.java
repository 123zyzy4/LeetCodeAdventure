package JianZhiOffer;

public class LCR105 {
    int res = 0;
    public int maxAreaOfIsland(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]==1){
                    res = Math.max(backtrack(grid,i,j),res);
                }
            }
        }
        return res;
    }
    private int backtrack(int[][] grid,int i,int j){
        if(i<0||i>= grid.length||j<0||j>=grid[0].length||grid[i][j]==0){
            return 0;
        }
        grid[i][j] = 0;
        return 1+backtrack(grid,i-1,j)+backtrack(grid, i+1, j)+backtrack(grid, i, j-1)+backtrack(grid, i, j+1);
    }

}
