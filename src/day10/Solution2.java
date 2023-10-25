package day10;

import java.util.List;


public class Solution2 {




    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode middle = findMiddle(head);
        ListNode right = middle.next;
        middle.next = null;

        ListNode leftSorted = sortList(head);
        ListNode rightSorted = sortList(right);

        return merge(leftSorted, rightSorted);
    }

    private ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (left != null && right != null) {
            if (left.val < right.val) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }

        if (left != null) {
            current.next = left;
        } else {
            current.next = right;
        }

        return dummy.next;
    }
    //下面我写的o(n2)的版本。。虽然垃圾但好歹也通过了29/30。。。
//    public ListNode sortList(ListNode head) {
//        ListNode dummy = new ListNode(Integer.MIN_VALUE);
//        dummy.next = null;
//        ListNode cur=head,next;
//        while(cur!=null){
//            next = cur.next;
//            cur.next = null;
//
//
//            dummy = addNode(dummy,cur);
//
//            cur = next;
//        }
//        return dummy.next;
//    }
//
//    private ListNode addNode(ListNode dummy,ListNode target){
//        ListNode pre = dummy,cur=dummy.next;
//        while(cur!=null){
//            if(target.val>cur.val){
//                pre = pre.next;
//                cur = cur.next;
//            }else {
//                break;
//            }
//
//        }
//        pre.next = target;
//        target.next = cur;
//        return dummy;
//    }
}
