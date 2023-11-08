package day15;
import org.junit.Test;
import org.junit.Assert;

public class FindMinInRotatedArrayTest {
    @Test
    public void testFindMin() {
        Solution5 solution = new Solution5();

        // 示例1
        int[] nums1 = {3, 4, 5, 1, 2};
        int expected1 = 1;
        int result1 = solution.findMin(nums1);
        Assert.assertEquals(expected1, result1);

        // 示例2
        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        int expected2 = 0;
        int result2 = solution.findMin(nums2);
        Assert.assertEquals(expected2, result2);

        // 示例3
        int[] nums3 = {11, 13, 15, 17};
        int expected3 = 11;
        int result3 = solution.findMin(nums3);
        Assert.assertEquals(expected3, result3);

        // 更多测试用例可以根据需要添加
    }
}
