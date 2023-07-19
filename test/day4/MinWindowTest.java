package day4;

import day3.Solution3;
import org.junit.Assert;
import org.junit.Test;

/**
 * @ClassName MinWindowTest
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/18 9:47
 * @Version 1.0
 */
public class MinWindowTest {
    @Test
    public void testMinWindow() {

        Solution2 MinWindow=new Solution2();
        String s1 = "ADOBECODEBANC";
        String t1 = "ABC";
        String expected1 = "BANC";
        String result1 = MinWindow.minWindow(s1, t1);
        Assert.assertEquals(expected1, result1);

        String s2 = "a";
        String t2 = "a";
        String expected2 = "a";
        String result2 = MinWindow.minWindow(s2, t2);
        Assert.assertEquals(expected2, result2);

        String s3 = "a";
        String t3 = "aa";
        String expected3 = "";
        String result3 = MinWindow.minWindow(s3, t3);
        Assert.assertEquals(expected3, result3);
    }
}
