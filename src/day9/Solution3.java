package day9;

public class Solution3 {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode next=head.next;
        head.next = swapPairs(next.next);
        next.next=head;


        return next;
    }
//    public ListNode swapPairs(ListNode head) {
//        if(head==null||head.next==null){
//            return head;
//        }
//        ListNode pre=head,cur=head.next;
//        pre.next = cur.next;
//        cur.next=pre;
//        while(pre.next!=null&&pre.next.next!=null){
////            cur = pre.next;
////            pre.next=pre.next.next;
////            pre = cur;
////            cur = pre.next;
////
////
////
////            pre.next = cur.next;
////            cur.next=pre;
//            cur = pre.next.next;
//            pre.next=pre.next.next;
//            cur.next = pre.next.next;
//        }
//
//        return head;
//    }
}
