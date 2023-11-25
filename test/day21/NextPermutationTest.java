package day21;
import Hot100.day21.Solution4;
import org.junit.Test;
import org.junit.Assert;

public class NextPermutationTest {
    @Test
    public void testNextPermutation() {
        Solution4 solution = new Solution4();

//        // Test Case 1
//        int[] nums1 = {1, 2, 3};
//        int[] expected1 = {1, 3, 2};
//        solution.nextPermutation(nums1);
//        Assert.assertArrayEquals(expected1, nums1);
//
//        // Test Case 2
//        int[] nums2 = {3, 2, 1};
//        int[] expected2 = {1, 2, 3};
//        solution.nextPermutation(nums2);
//        Assert.assertArrayEquals(expected2, nums2);
//
//        // Test Case 3
//        int[] nums3 = {1, 1, 5};
//        int[] expected3 = {1, 5, 1};
//        solution.nextPermutation(nums3);
//        Assert.assertArrayEquals(expected3, nums3);
//
//        // Additional Test Case 1
//        int[] nums4 = {1, 2, 3, 4, 5};
//        int[] expected4 = {1, 2, 3, 5, 4};
//        solution.nextPermutation(nums4);
//        Assert.assertArrayEquals(expected4, nums4);
//
//        // Additional Test Case 2
//        int[] nums5 = {5, 4, 3, 2, 1};
//        int[] expected5 = {1, 2, 3, 4, 5};
//        solution.nextPermutation(nums5);
//        Assert.assertArrayEquals(expected5, nums5);

        // Additional Test Case 3
        int[] nums6 = {1, 3, 2};
        int[] expected6 = {2, 1, 3};
        solution.nextPermutation(nums6);
        Assert.assertArrayEquals(expected6, nums6);
    }
}
