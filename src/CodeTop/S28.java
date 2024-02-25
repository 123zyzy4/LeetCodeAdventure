package CodeTop;

import org.testng.annotations.Test;

public class S28 {
    public void reorderList(ListNode head) {
        ListNode slow = head,fast = head;
        while(fast.next!=null&&fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode tmp = slow.next;
        slow.next = null;
        ListNode lastHalf = reverse(tmp);
        ListNode cur = head;
        while(lastHalf!=null){
            ListNode lastHalfNext = lastHalf.next;
            ListNode next = cur.next;
            cur.next = lastHalf;
            lastHalf.next = next;
            cur = next;
            lastHalf = lastHalfNext;

        }
        return;


    }

    private ListNode reverse(ListNode head){
        ListNode pre = null,cur = head;
        while(cur!=null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    @Test
    public void test(){
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        reorderList(node1);
    }
}
