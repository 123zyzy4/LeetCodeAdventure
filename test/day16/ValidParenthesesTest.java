package day16;
import org.junit.Test;
import org.junit.Assert;

public class ValidParenthesesTest {
    @Test
    public void testIsValid() {
        Solution1 solution = new Solution1();

        // 示例测试用例
        Assert.assertTrue(solution.isValid("()"));
        Assert.assertTrue(solution.isValid("()[]{}"));
        Assert.assertFalse(solution.isValid("(]"));

        // 更多测试用例
        Assert.assertTrue(solution.isValid(""));
        Assert.assertTrue(solution.isValid("[]"));
        Assert.assertTrue(solution.isValid("{}"));
        Assert.assertTrue(solution.isValid("[]{}"));
        Assert.assertTrue(solution.isValid("[{}]"));
        Assert.assertFalse(solution.isValid("("));
        Assert.assertFalse(solution.isValid(")"));
        Assert.assertFalse(solution.isValid("({}"));
        Assert.assertFalse(solution.isValid("[(])"));
        Assert.assertFalse(solution.isValid("()(()())"));
    }
}
