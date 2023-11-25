package day6;

import Hot100.day6.Solution3;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName SpiralOrderTest
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/27 9:37
 * @Version 1.0
 */
public class SpiralOrderTest {

    @Test
    public void testSpiralOrder() {
        Solution3 SpiralOrder=new Solution3();
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        List<Integer> expected1 = Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5);
        List<Integer> result1 = SpiralOrder.spiralOrder(matrix1);
        Assert.assertEquals(expected1, result1);

        int[][] matrix2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        List<Integer> expected2 = Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7);
        List<Integer> result2 = SpiralOrder.spiralOrder(matrix2);
        Assert.assertEquals(expected2, result2);

        int[][] matrix3 = {
                {1}
        };
        List<Integer> expected3 = Arrays.asList(1);
        List<Integer> result3 = SpiralOrder.spiralOrder(matrix3);
        Assert.assertEquals(expected3, result3);

        int[][] matrix4 = {
                {1, 2},
                {3, 4}
        };
        List<Integer> expected4 = Arrays.asList(1, 2, 4, 3);
        List<Integer> result4 = SpiralOrder.spiralOrder(matrix4);
        Assert.assertEquals(expected4, result4);
    }
}
