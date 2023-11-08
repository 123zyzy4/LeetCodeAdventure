package day13;

public class Solution1 {
    boolean[][] visited;
    public int numIslands(char[][] grid) {
        this.visited = new boolean[grid.length][grid[0].length];

        int res = 0;
//        while(judge(grid,visited)!=null){
//            res++;
//            int[] pos = judge(grid,visited);
//            dfs(grid,pos[0],pos[1]);
//
//        }
        for (int i = 0; i < visited.length; i++) {
            for (int j = 0; j < visited[0].length; j++) {
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    res++;
                }
            }
        }
        return res;

    }

    private void dfs(char[][] grid,int i,int j){
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0' || visited[i][j]) {
            return;
        }
//        visited[i][j] = true;
        grid[i][j] = '0';
        dfs(grid, i+1, j);
        dfs(grid, i, j+1);
        dfs(grid,i-1,j);
        dfs(grid, i, j-1);
        return;
    }

    private int[] judge(char[][] grid,boolean[][] visited){
        for (int i = 0; i < visited.length; i++) {
            for (int j = 0; j < visited[0].length; j++) {
                if(grid[i][j]=='1'&&visited[i][j]==false){
                    return new int[]{i,j};
                }
            }
        }

        return null;
    }
}
