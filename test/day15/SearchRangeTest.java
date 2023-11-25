package day15;
import Hot100.day15.Solution3;
import org.junit.Test;
import org.junit.Assert;

public class SearchRangeTest {
    @Test
    public void testSearchRange() {
        Solution3 solution = new Solution3();

        // 示例1
        int[] nums1 = {5, 7, 7, 8, 8, 10};
        int target1 = 8;
        int[] expected1 = {3, 4};
        int[] result1 = solution.searchRange(nums1, target1);
        Assert.assertArrayEquals(expected1, result1);

        // 示例2
        int[] nums2 = {5, 7, 7, 8, 8, 10};
        int target2 = 6;
        int[] expected2 = {-1, -1};
        int[] result2 = solution.searchRange(nums2, target2);
        Assert.assertArrayEquals(expected2, result2);

        // 示例3
        int[] nums3 = {};
        int target3 = 0;
        int[] expected3 = {-1, -1};
        int[] result3 = solution.searchRange(nums3, target3);
        Assert.assertArrayEquals(expected3, result3);

        // 针对边界情况的测试
        int[] nums4 = {1};
        int target4 = 1;
        int[] expected4 = {0, 0};
        int[] result4 = solution.searchRange(nums4, target4);
        Assert.assertArrayEquals(expected4, result4);

        int[] nums5 = {1};
        int target5 = 0;
        int[] expected5 = {-1, -1};
        int[] result5 = solution.searchRange(nums5, target5);
        Assert.assertArrayEquals(expected5, result5);

        int[] nums6 = {1, 1, 1, 1, 1};
        int target6 = 1;
        int[] expected6 = {0, 4};
        int[] result6 = solution.searchRange(nums6, target6);
        Assert.assertArrayEquals(expected6, result6);
    }
}
