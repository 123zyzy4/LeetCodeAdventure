package CodeTop;

public class S4 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        while(head!=null){
            ListNode tail = pre;
            for (int i = 0; i < k; i++) {
                tail = tail.next;
                if(tail==null){
                    return dummy.next;
                }
            }
            ListNode next = tail.next;
            ListNode[] reverseResult = reverse(head,tail);
            head = reverseResult[0];
            tail = reverseResult[1];
            pre.next = head;
            tail.next = next;
            pre = tail;
            head = tail.next;
        }
        return dummy.next;
    }

    private ListNode[] reverse(ListNode head,ListNode tail){
        ListNode pre = tail.next;
        ListNode cur = head;
        while(pre!=tail){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return new ListNode[]{tail,head};
    }
}
