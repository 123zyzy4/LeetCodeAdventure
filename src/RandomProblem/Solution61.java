package RandomProblem;

import Hot100.day10.ListNode;
import org.testng.annotations.Test;

public class Solution61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next == null){
            return head;
        }
        ListNode cur = head;
        int size = 1;
        while (cur.next!=null){
            size++;
            cur = cur.next;
        }
        ListNode tail = cur;
        k = k%size;
        if(k == 0){
            return head;
        }
        k = size - k;
        cur = head;
        ListNode pre = null;
        for (int i = 0; i < k; i++) {
            pre = cur;
            cur = cur.next;
        }
        pre.next = null;
        tail.next = head;
        head = cur;
        return head;

    }
    @Test
    private void test(){
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;


        rotateRight(head,2);
    }
}
