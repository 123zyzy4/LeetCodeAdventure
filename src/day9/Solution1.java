package day9;


public class Solution1 {
    public boolean hasCycle(ListNode head) {
        if(head==null)return false;
        ListNode slow = head,fast = head;
        while(fast.next!=null&&fast.next.next!=null){
            slow = slow.next;
            fast=fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}









//public class day13.Solution1 {
//    public static void main(String[] args) {
//        ListNode head = new ListNode(9);
//        Boolean b= hasCycle(head);
//        System.out.println(head.val);
//
//    }
//
////    public class Solution {
////        public boolean hasCycle(ListNode head) {
////            head = null;
////            return false;
////        }
////    }
//    public static boolean hasCycle(ListNode head) {
//        head = null;
//        return false;
//    }
//}
