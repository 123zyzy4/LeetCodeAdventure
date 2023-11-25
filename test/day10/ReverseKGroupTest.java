package day10;
import Hot100.day10.ListNode;
import Hot100.day10.Solution1;
import org.junit.Test;
import org.junit.Assert;

public class ReverseKGroupTest {
    @Test
    public void testReverseKGroup() {
        // 创建链表示例 [1,2,3,4,5]
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        Solution1 solution = new Solution1();

        // 测试用例1，k = 2
        int k1 = 2;
        ListNode expected1 = new ListNode(2);
        expected1.next = new ListNode(1);
        expected1.next.next = new ListNode(4);
        expected1.next.next.next = new ListNode(3);
        expected1.next.next.next.next = new ListNode(5);
        ListNode result1 = solution.reverseKGroup(head1, k1);
        assertLinkedListEquals(expected1, result1);


        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);
        // 测试用例2，k = 3
        int k2 = 3;
        ListNode expected2 = new ListNode(3);
        expected2.next = new ListNode(2);
        expected2.next.next = new ListNode(1);
        expected2.next.next.next = new ListNode(4);
        expected2.next.next.next.next = new ListNode(5);
        ListNode result2 = solution.reverseKGroup(head2, k2);
        assertLinkedListEquals(expected2, result2);
    }




    // 辅助方法，用于比较两个链表是否相等
    private void assertLinkedListEquals(ListNode expected, ListNode actual) {
        while (expected != null && actual != null) {
            Assert.assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
        Assert.assertNull(expected);
        Assert.assertNull(actual);
    }
}
