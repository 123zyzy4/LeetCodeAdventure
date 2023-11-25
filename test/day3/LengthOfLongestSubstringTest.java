package day3;

import Hot100.day3.Solution1;
import org.junit.Assert;
import org.junit.Test;

/**
 * @ClassName LengthOfLongestSubstringTest
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/17 8:08
 * @Version 1.0
 */
public class LengthOfLongestSubstringTest {
    @Test
    public void testLengthOfLongestSubstring() {

        Solution1 LengthOfLongestSubstring=new Solution1();
        String s1 = "abcabcbb";
        int expected1 = 3;
        int result1 = LengthOfLongestSubstring.lengthOfLongestSubstring(s1);
        Assert.assertEquals(expected1, result1);

        String s2 = "bbbbb";
        int expected2 = 1;
        int result2 = LengthOfLongestSubstring.lengthOfLongestSubstring(s2);
        Assert.assertEquals(expected2, result2);

        String s3 = "pwwkew";
        int expected3 = 3;
        int result3 = LengthOfLongestSubstring.lengthOfLongestSubstring(s3);
        Assert.assertEquals(expected3, result3);

        String s4 = "abcdefg";
        int expected4 = 7;
        int result4 = LengthOfLongestSubstring.lengthOfLongestSubstring(s4);
        Assert.assertEquals(expected4, result4);

        String s5 = "aab";
        int expected5 = 2;
        int result5 = LengthOfLongestSubstring.lengthOfLongestSubstring(s5);
        Assert.assertEquals(expected5, result5);
    }
}
