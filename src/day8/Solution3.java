package day8;

/**
 * @ClassName Solution3
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/29 12:02
 * @Version 1.0
 */
public class Solution3 {
    public ListNode detectCycle(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode slow=head,fast=head;


        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                fast=head;
                while(true){
                    if(slow==fast){
                        return slow;
                    }
                    slow=slow.next;
                    fast=fast.next;

                }
            }
        }

        return null;
    }
}
