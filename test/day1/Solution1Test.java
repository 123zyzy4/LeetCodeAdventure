package day1;

import Hot100.day1.Solution1;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;


/**
 * @ClassName Solution1Test
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/13 14:54
 * @Version 1.0
 */
public class Solution1Test {
    @Test
    public void testTwoSum() {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] expected1 = {0, 1};
        int[] result1 = Solution1.twoSum(nums1, target1);
        Assert.assertTrue(containsSameElements(expected1, result1));


    }

    private boolean containsSameElements(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }

        for (int num : arr2) {
            set2.add(num);
        }

        return set1.equals(set2);
    }

    @Test
    public void test(){
        System.out.println("12345".substring(1,2));
    }


    @Test
    public void test2(){
        int x='a';
        int y='A';
        int z='z'-'A';
        System.out.println("z  "+z);
        System.out.println(x);
        System.out.println(y);
    }
}
