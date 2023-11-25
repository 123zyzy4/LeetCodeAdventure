package day9;

import Hot100.day9.ListNode;
import Hot100.day9.Solution3;
import org.junit.Assert;
import org.junit.Test;

public class SwapPairsTest {
    @Test
    public void testSwapPairs() {
        // 创建测试链表
        ListNode input1 = createLinkedList(new int[]{1, 2, 3, 4});
        ListNode expected1 = createLinkedList(new int[]{2, 1, 4, 3});
        Solution3 solution = new Solution3();
        ListNode result1 = solution.swapPairs(input1);
        assertLinkedListEquals(expected1, result1);

        ListNode input2 = createLinkedList(new int[]{});
        ListNode expected2 = createLinkedList(new int[]{});
        ListNode result2 = solution.swapPairs(input2);
        assertLinkedListEquals(expected2, result2);

        ListNode input3 = createLinkedList(new int[]{1});
        ListNode expected3 = createLinkedList(new int[]{1});
        ListNode result3 = solution.swapPairs(input3);
        assertLinkedListEquals(expected3, result3);
    }

    // 辅助函数用于创建链表
    private ListNode createLinkedList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }

    // 辅助函数用于比较两个链表是否相同
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
