package day3;

import Hot100.day3.Solution2;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName FindAnagramsTest
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/17 9:09
 * @Version 1.0
 */
public class FindAnagramsTest {

    @Test
    public void testFindAnagrams() {

        Solution2 FindAnagrams=new Solution2();
        String s1 = "cbaebabacd";
        String p1 = "abc";
        List<Integer> expected1 = Arrays.asList(0, 6);
        List<Integer> result1 = FindAnagrams.findAnagrams(s1, p1);
        Assert.assertEquals(expected1, result1);

        String s2 = "abab";
        String p2 = "ab";
        List<Integer> expected2 = Arrays.asList(0, 1, 2);
        List<Integer> result2 = FindAnagrams.findAnagrams(s2, p2);
        Assert.assertEquals(expected2, result2);

        String s3 = "abcdefg";
        String p3 = "xyz";
        List<Integer> expected3 = Arrays.asList();
        List<Integer> result3 = FindAnagrams.findAnagrams(s3, p3);
        Assert.assertEquals(expected3, result3);
    }
}
