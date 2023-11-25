package day2;

import Hot100.day2.Solution4;
import org.junit.Assert;
import org.junit.Test;

/**
 * @ClassName TrapTest
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/15 11:49
 * @Version 1.0
 */
public class TrapTest {

    @Test
    public void testTrap() {
        Solution4 Trap=new Solution4();
        int[] height1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int expected1 = 6;
        int result1 = Trap.trap(height1);
        Assert.assertEquals(expected1, result1);

        int[] height2 = {4, 2, 0, 3, 2, 5};
        int expected2 = 9;
        int result2 = Trap.trap(height2);
        Assert.assertEquals(expected2, result2);

        int[] height3 = {1, 2, 3, 4, 5};
        int expected3 = 0;
        int result3 = Trap.trap(height3);
        Assert.assertEquals(expected3, result3);

        int[] height4 = {5, 4, 3, 2, 1};
        int expected4 = 0;
        int result4 = Trap.trap(height4);
        Assert.assertEquals(expected4, result4);
    }
}
