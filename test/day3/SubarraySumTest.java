package day3;

import org.junit.Assert;
import org.junit.Test;

/**
 * @ClassName SubarraySumTest
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/17 9:47
 * @Version 1.0
 */
public class SubarraySumTest {
    @Test
    public void testSubarraySum() {
        Solution3 SubarraySum=new Solution3();
        int[] nums1 = {1, 1, 1};
        int k1 = 2;
        int expected1 = 2;
        int result1 = SubarraySum.subarraySum(nums1, k1);
        Assert.assertEquals(expected1, result1);

        int[] nums2 = {1, 2, 3};
        int k2 = 3;
        int expected2 = 2;
        int result2 = SubarraySum.subarraySum(nums2, k2);
        Assert.assertEquals(expected2, result2);

        int[] nums3 = {1, 2, 1, 2, 1};
        int k3 = 3;
        int expected3 = 4;
        int result3 = SubarraySum.subarraySum(nums3, k3);
        Assert.assertEquals(expected3, result3);

        int[] nums4 = {-1, -1, 1, -1, 1};
        int k4 = 0;
        int expected4 = 7;
        int result4 = SubarraySum.subarraySum(nums4, k4);
        Assert.assertEquals(expected4, result4);
    }
}
