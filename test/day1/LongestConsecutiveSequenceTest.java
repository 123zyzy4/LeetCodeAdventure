package day1;

import org.junit.Assert;
import org.junit.Test;

/**
 * @ClassName LongestConsecutiveSequenceTest
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/14 13:13
 * @Version 1.0
 */
public class LongestConsecutiveSequenceTest {
    @Test
    public void testLongestConsecutive() {
        Solution3 LongestConsecutiveSequence=new Solution3();
        int[] nums1 = {100, 4, 200, 1, 3, 2};
        int expected1 = 4;
        int result1 = LongestConsecutiveSequence.longestConsecutive(nums1);
        Assert.assertEquals(expected1, result1);

        int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int expected2 = 9;
        int result2 = LongestConsecutiveSequence.longestConsecutive(nums2);
        Assert.assertEquals(expected2, result2);
    }
}
