package Hot100.day8;

/**
 * @ClassName Solution2
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/29 11:54
 * @Version 1.0
 */
public class Solution2 {
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null||head.next.next==null){
            return false;
        }
        ListNode slow=head,fast=head;


        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }

        return false;


    }
}
