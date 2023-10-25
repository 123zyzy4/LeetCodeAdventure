package day10;

public class Solution1 {
    //虽然写的是一坨，但是你就说通没通过吧！
    public ListNode reverseKGroup(ListNode head, int k) {

        if(head==null)return null;
        if(k<=1)return head;
        ListNode end=head,cur=head;
        int i=0;
        while(i<k&&end!=null){
            i++;
            end = end.next;
        }
        if(end==null&&i<k) {
            return head;
        }else {
            end = reverseKGroup(end,k);
        }

        int j=2;
        ListNode tmp=head.next;
        cur = tmp;

        head.next = end;
        tmp = cur.next;
        cur.next = head;

        head = cur;

        while(j<k){

            j++;
            cur = tmp;
            tmp = cur.next;
            cur.next = head;
            head = cur;



        }

        return head;
    }
}
//        ListNode next,pre;
//        cur = head.next;
//        head.next=end;
//        next = cur.next;
//        cur.next = head;
//        head = cur;
//
//        while(next!=end){
//            cur = next;
//            next = next.next;
//            cur.next = head;
//            head = cur;
//        }
