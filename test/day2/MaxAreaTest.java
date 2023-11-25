package day2;

import Hot100.day2.Solution2;
import org.junit.Assert;
import org.junit.Test;

/**
 * @ClassName MaxAreaTest
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/15 8:04
 * @Version 1.0
 */
public class MaxAreaTest {
    @Test
    public void testMaxArea() {
        Solution2 MaxArea = new Solution2();


        int[] height0 = {1,3,2,5,25,24,5};
        int expected0 = 24;
        int result0 = MaxArea.maxArea(height0);
        Assert.assertEquals(expected0, result0);


        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expected1 = 49;
        int result1 = MaxArea.maxArea(height1);
        Assert.assertEquals(expected1, result1);

        int[] height2 = {1, 1};
        int expected2 = 1;
        int result2 = MaxArea.maxArea(height2);
        Assert.assertEquals(expected2, result2);

        int[] height3 = {4, 3, 2, 1, 4};
        int expected3 = 16;
        int result3 = MaxArea.maxArea(height3);
        Assert.assertEquals(expected3, result3);

        int[] height4 = {1, 2, 1};
        int expected4 = 2;
        int result4 = MaxArea.maxArea(height4);
        Assert.assertEquals(expected4, result4);



    }
}
