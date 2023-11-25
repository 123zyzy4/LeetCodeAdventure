package Hot100.day9;

public class Solution2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0,head);
        ListNode left=dummy,right=head;

        for (int i = 0; i < n; i++){
            right = right.next;
        }

        while(right!=null){
            left = left.next;

            right = right.next;

        }

        left.next= left.next.next;


        return dummy.next;
    }
}
