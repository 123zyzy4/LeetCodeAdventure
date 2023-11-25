package day6;


import Hot100.day6.Solution1;
import org.junit.Test;
import org.junit.Assert;

/**
 * @ClassName FirstMissingPositiveTest
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/27 7:56
 * @Version 1.0
 */
public class FirstMissingPositiveTest {
    @Test
    public void testFirstMissingPositive() {
        Solution1 FirstMissingPositive=new Solution1();
        int[] nums1 = {0,2,2,1,1};
        int expected1 = 3;
        int result1 = FirstMissingPositive.firstMissingPositive(nums1);
        Assert.assertEquals(expected1, result1);

        int[] nums2 = {3, 4, -1, 1};
        int expected2 = 2;
        int result2 = FirstMissingPositive.firstMissingPositive(nums2);
        Assert.assertEquals(expected2, result2);

        int[] nums3 = {7, 8, 9, 11, 12};
        int expected3 = 1;
        int result3 = FirstMissingPositive.firstMissingPositive(nums3);
        Assert.assertEquals(expected3, result3);

        int[] nums4 = {1, 2, 3, 4, 5};
        int expected4 = 6;
        int result4 = FirstMissingPositive.firstMissingPositive(nums4);
        Assert.assertEquals(expected4, result4);

        int[] nums5 = {-1, -2, -3};
        int expected5 = 1;
        int result5 = FirstMissingPositive.firstMissingPositive(nums5);
        Assert.assertEquals(expected5, result5);
    }
}
