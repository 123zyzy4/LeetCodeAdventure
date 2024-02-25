package CodeTop;

import java.util.List;

public class S22 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1),pre = dummy;
        dummy.next = head;
        ListNode tail = head;
        for (int i = 0; i < left-1; i++) {
//            if(head.next!=null){
//                head = head.next;
//            }else {
//                return dummy.next;
//            }
            pre = pre.next;
            head = head.next;
        }
        for (int i = 0; i < right-1; i++) {
            tail = tail.next;
        }
        ListNode tmp = tail.next;
        ListNode[] res = reverse(head,tail);
        ListNode leftNode = res[0],rightNode = res[1];
        pre.next = leftNode;
        rightNode.next = tmp;
        return dummy.next;
    }

    private ListNode[] reverse(ListNode head, ListNode tail){
        ListNode pre = tail.next,cur = head;
        while(pre!=tail){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return new ListNode[]{tail,head};

    }
}
