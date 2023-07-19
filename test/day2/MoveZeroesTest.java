package day2;

import org.junit.Assert;
import org.junit.Test;

/**
 * @ClassName MoveZeroesTest
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/15 7:21
 * @Version 1.0
 */
public class MoveZeroesTest {
    @Test
    public void testMoveZeroes() {
        Solution1 MoveZeroes =new Solution1();
        int[] nums1 = {0, 1, 0, 3, 12};
        int[] expected1 = {1, 3, 12, 0, 0};
        MoveZeroes.moveZeroes(nums1);
        Assert.assertArrayEquals(expected1, nums1);

        int[] nums2 = {0};
        int[] expected2 = {0};
        MoveZeroes.moveZeroes(nums2);
        Assert.assertArrayEquals(expected2, nums2);

        int[] nums3 = {1, 2, 3, 4, 5};
        int[] expected3 = {1, 2, 3, 4, 5};
        MoveZeroes.moveZeroes(nums3);
        Assert.assertArrayEquals(expected3, nums3);

        int[] nums4 = {0, 0, 0, 0, 0};
        int[] expected4 = {0, 0, 0, 0, 0};
        MoveZeroes.moveZeroes(nums4);
        Assert.assertArrayEquals(expected4, nums4);
    }
}
