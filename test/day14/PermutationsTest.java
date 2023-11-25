package day14;
import Hot100.day14.Solution1;
import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

public class PermutationsTest {

    @Test
    public void testPermute() {
        Solution1 solution = new Solution1();

        // 示例 1
        int[] nums1 = {1, 2, 3};
        List<List<Integer>> expected1 = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(1, 3, 2),
                Arrays.asList(2, 1, 3),
                Arrays.asList(2, 3, 1),
                Arrays.asList(3, 1, 2),
                Arrays.asList(3, 2, 1)
        );
        List<List<Integer>> result1 = solution.permute(nums1);
        Assert.assertEquals(expected1, result1);

        // 示例 2
        int[] nums2 = {0, 1};
        List<List<Integer>> expected2 = Arrays.asList(
                Arrays.asList(0, 1),
                Arrays.asList(1, 0)
        );
        List<List<Integer>> result2 = solution.permute(nums2);
        Assert.assertEquals(expected2, result2);

        // 示例 3
        int[] nums3 = {1};
        List<List<Integer>> expected3 = Arrays.asList(
                Arrays.asList(1)
        );
        List<List<Integer>> result3 = solution.permute(nums3);
        Assert.assertEquals(expected3, result3);
    }
}
