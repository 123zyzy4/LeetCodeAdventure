package day13;
import org.junit.Test;
import org.junit.Assert;

public class Solution1Test {
    @Test
    public void testNumIslands() {
        Solution1 solution = new Solution1();

        // 示例1
        char[][] grid1 = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        int expected1 = 1;
        int result1 = solution.numIslands(grid1);
        Assert.assertEquals(expected1, result1);

        // 示例2
        char[][] grid2 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        int expected2 = 3;
        int result2 = solution.numIslands(grid2);
        Assert.assertEquals(expected2, result2);

        // 自定义测试1 - 无岛屿
        char[][] grid3 = {
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        int expected3 = 0;
        int result3 = solution.numIslands(grid3);
        Assert.assertEquals(expected3, result3);

        // 自定义测试2 - 单个岛屿
        char[][] grid4 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        int expected4 = 1;
        int result4 = solution.numIslands(grid4);
        Assert.assertEquals(expected4, result4);
    }
}
