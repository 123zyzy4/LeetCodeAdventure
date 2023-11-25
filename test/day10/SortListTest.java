package day10;
import Hot100.day10.ListNode;
import Hot100.day10.Solution2;
import org.junit.Test;
import org.junit.Assert;

public class SortListTest {
    @Test
    public void testSortList() {
        // 创建链表节点
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(3);

        // 构建链表：4 -> 2 -> 1 -> 3
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        Solution2 solution = new Solution2();

        // 调用排序函数
        ListNode result = solution.sortList(node1);

        // 验证排序后的链表节点值
        Assert.assertEquals(1, result.val);
        Assert.assertEquals(2, result.next.val);
        Assert.assertEquals(3, result.next.next.val);
        Assert.assertEquals(4, result.next.next.next.val);
        Assert.assertNull(result.next.next.next.next); // 链表末尾应为null
    }

    @Test
    public void testSortListEmptyList() {
        // 创建空链表
        ListNode emptyList = null;

        Solution2 solution = new Solution2();

        // 调用排序函数
        ListNode result = solution.sortList(emptyList);

        // 空链表排序后应为空
        Assert.assertNull(result);
    }

    @Test
    public void testSortListSingleElement() {
        // 创建只包含一个元素的链表
        ListNode singleElementList = new ListNode(5);

        Solution2 solution = new Solution2();

        // 调用排序函数
        ListNode result = solution.sortList(singleElementList);

        // 单元素链表排序后应仍然为单元素链表
        Assert.assertEquals(5, result.val);
        Assert.assertNull(result.next);
    }
}
