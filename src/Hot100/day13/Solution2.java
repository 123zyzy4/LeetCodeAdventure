package Hot100.day13;

import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {
    public int orangesRotting(int[][] grid) {

        int count = 0;
        Queue<int[]> queue = new LinkedList<>();

        int row = grid.length;
        int col = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(grid[i][j]==1){
                    count++;
                }else if(grid[i][j]==2){
                    queue.add(new int[]{i,j});
                }
            }
        }

        int res = 0;
        while(count>0&&!queue.isEmpty()){
            res++;
            int currentsize = queue.size();
            for (int i = 0; i < currentsize; i++) {
                int[] tmp = queue.remove();
                if(tmp[0]+1<row&&grid[tmp[0]+1][tmp[1]]==1){
                    grid[tmp[0]+1][tmp[1]]=2;
                    count--;
                    queue.add(new int[]{tmp[0]+1,tmp[1]});
                }
                if(tmp[0]-1>=0&&grid[tmp[0]-1][tmp[1]]==1){
                    grid[tmp[0]-1][tmp[1]]=2;
                    count--;
                    queue.add(new int[]{tmp[0]-1,tmp[1]});
                }
                if(tmp[1]-1>=0&&grid[tmp[0]][tmp[1]-1]==1){
                    grid[tmp[0]][tmp[1]-1]=2;
                    count--;
                    queue.add(new int[]{tmp[0],tmp[1]-1});
                }
                if(tmp[1]+1<col&&grid[tmp[0]][tmp[1]+1]==1){
                    grid[tmp[0]][tmp[1]+1]=2;
                    count--;
                    queue.add(new int[]{tmp[0],tmp[1]+1});
                }

            }

        }
        if(count!=0){
            return -1;
        }else {
            return res;
        }
    }

//    private void dfs(int[][] grid,int i,int j,int res){
//        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
//            return;
//        }
//        grid[i][j] = 2;
//        res++;
//        dfs(grid, i+1, j,res);
//        dfs(grid, i, j+1,res);
//        dfs(grid,i-1,j,res);
//        dfs(grid, i, j-1,res);
//        return;
//    }
}
