package CodeTop;

public class S24 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0,lenB = 0;
        ListNode curA = headA,curB = headB;
        while(curA!=null){
            curA = curA.next;
            lenA++;
        }
        while(curB!=null){
            curB = curB.next;
            lenB++;
        }
        curA = headA;
        curB = headB;
        for (int i = 0; i < lenA-lenB; i++) {
            curA = curA.next;
        }
        for (int i = 0; i < lenB-lenA; i++) {
            curB = curB.next;
        }
        while(curA!=curB&&curA!=null&&curB!=null){
            curA = curA.next;
            curB = curB.next;
        }
        return curA;
    }
}
