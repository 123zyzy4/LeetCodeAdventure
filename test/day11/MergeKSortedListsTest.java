package day11;
import Hot100.day11.ListNode;
import Hot100.day11.Solution2;
import org.junit.Test;
import org.junit.Assert;


public class MergeKSortedListsTest {
    @Test
    public void testMergeKLists() {
        Solution2 solution = new Solution2();

        // Test case 1
        ListNode[] lists1 = new ListNode[] {
                createList(new int[] {1, 4, 5}),
                createList(new int[] {1, 3, 4}),
                createList(new int[] {2, 6})
        };
        ListNode expected1 = createList(new int[] {1, 1, 2, 3, 4, 4, 5, 6});
        ListNode result1 = solution.mergeKLists(lists1);
        assertListEquals(expected1, result1);

        // Test case 2
        ListNode[] lists2 = new ListNode[0];
        ListNode expected2 = null;
        ListNode result2 = solution.mergeKLists(lists2);
        assertListEquals(expected2, result2);

        // Test case 3
        ListNode[] lists3 = new ListNode[] {
                createList(new int[0])
        };
        ListNode expected3 = null;
        ListNode result3 = solution.mergeKLists(lists3);
        assertListEquals(expected3, result3);
    }

    private ListNode createList(int[] values) {
        if (values == null || values.length == 0) {
            return null;
        }
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    private void assertListEquals(ListNode expected, ListNode actual) {
        while (expected != null && actual != null) {
            Assert.assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
        Assert.assertNull(expected);
        Assert.assertNull(actual);
    }
}
