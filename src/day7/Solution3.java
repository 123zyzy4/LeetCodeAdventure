package day7;

/**
 * @ClassName Solution3
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/28 9:37
 * @Version 1.0
 */
public class Solution3 {
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//
//        int lengthA=0,lengthB=0;
//        ListNode cur=headA;
//        while(cur.next!=null){
//            cur=cur.next;
//            lengthA++;
//
//        }
//        cur=headB;
//        while(cur.next!=null){
//            cur=cur.next;
//            lengthB++;
//        }
//        if(lengthA>=lengthB){
//            for (int i = 0; i < lengthA-lengthB; i++) {
//                headA=headA.next;
//            }
//        }else {
//            for (int i = 0; i < lengthB-lengthA; i++) {
//                headB=headB.next;
//            }
//        }
//
//        while(headA!=headB){
//            headA=headA.next;
//            headB=headB.next;
//        }
//        if(headA==headB){
//            return headA;
//        }else {
//            return null;
//        }
//
//
//
//
//    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        ListNode A=headA,B=headB;
        while(A!=B){
            A=A!=null?A.next:headB;
            B=B!=null?B.next:headA;
        }
        return A;
    }
}
