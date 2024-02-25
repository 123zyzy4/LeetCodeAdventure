package CodeTop;

import java.util.PriorityQueue;

public class S25 {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(((o1, o2) -> {return o1.val-o2.val;}));
        for (ListNode list : lists) {
            if(list!=null){
                priorityQueue.offer(list);
            }
        }
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        while(!priorityQueue.isEmpty()){
            ListNode tmp = priorityQueue.poll();
            cur.next = tmp;
            cur = cur.next;
            if(tmp.next!=null){
                priorityQueue.offer(tmp.next);
            }
        }
        return dummy.next;
    }
//    public ListNode mergeKLists(ListNode[] lists) {
//        for (int i = 1; i < lists.length; i++) {
//            ListNode newList = mergeTwoLists(lists[0],lists[i]);
//            lists[0] = newList;
//        }
//        return lists[0];
//    }
//
//    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode dummy = new ListNode(-1),cur = dummy;
//
//        while(list1!=null&&list2!=null){
//            if(list1.val< list2.val){
//                cur.next = list1;
//                cur = cur.next;
//                list1 = list1.next;
//            }else {
//                cur.next = list2;
//                cur = cur.next;
//                list2 = list2.next;
//            }
//        }
//        if(list1!=null){
//            cur.next = list1;
//        }
//        if(list2!=null){
//            cur.next = list2;
//        }
//        return dummy.next;
//    }
}
