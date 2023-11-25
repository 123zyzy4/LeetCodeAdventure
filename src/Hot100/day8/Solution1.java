package Hot100.day8;



/**
 * @ClassName day13.Solution1
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/29 9:32
 * @Version 1.0
 */
public class Solution1 {
    ListNode pre;

    public boolean isPalindrome(ListNode head) {
       pre=head;
       return check(head);
    }

    private boolean check(ListNode head){
        if(head==null){
            return true;
        }

        boolean res=check(head.next)&&head.val== pre.val;
        pre=pre.next;
        return res;
    }


}
