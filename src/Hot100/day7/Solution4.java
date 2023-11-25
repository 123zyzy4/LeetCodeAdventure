package Hot100.day7;

/**
 * @ClassName Solution4
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/28 11:14
 * @Version 1.0
 */
public class Solution4 {
//    public ListNode reverseList(ListNode head) {
//        ListNode pre=null,cur=head,next;
//
//        while(cur!=null){
//            next=cur.next;
//            cur.next=pre;
//            pre=cur;
//            cur=next;
//
//        }
//
//        return pre;
//    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
}
