package CodeTop;

public class S2 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null,cur = head;
        while(cur!=null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return cur;
    }
}
