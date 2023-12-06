package RandomProblem;

import Hot100.day10.ListNode;



public class Solution82 {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode cur = dummy;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) {
                int x = cur.next.val;
                while (cur.next != null && cur.next.val == x) {
                    cur.next = cur.next.next;
                }
            } else {
                cur = cur.next;
            }
        }

        return dummy.next;
    }

    


    //写的有点啰嗦
    // public ListNode deleteDuplicates(ListNode head) {
    //     if(head==null||head.next==null){
    //         return head;
    //     }
    //     ListNode dummy = new ListNode(-1);
    //     dummy.next = head;
    //     ListNode cur = head,pre = dummy,tail = null;
    //     boolean flag = true;
    //     while(cur!=null&&cur.next!=null){
    //         tail = cur.next;
    //         if(tail.val==cur.val){
    //             flag = true;
    //         }else{
    //             flag = false;
    //         }
    //         while(tail!=null&&tail.val == cur.val){
    //             tail = tail.next;
    //         }
    //         if(flag){
    //             pre.next = tail;
    //             cur = tail;

    //         }else{
    //             pre = cur;
    //             cur = cur.next;
    //         }
            
            
    //     }
    //     return dummy.next;


    // }


    //写出来的是重复元素保留一个而不是全删除掉
//    public ListNode deleteDuplicates(ListNode head) {
//        HashMap<Integer,Integer> map= new HashMap<>();
//        ListNode cur = head;
//        int i = 0;
//        while(cur!=null){
//            if(!map.containsValue(cur.val)){
//                map.put(i,cur.val);
//                i++;
//            }
//            cur = cur.next;
//        }
//        ListNode dummy = new ListNode(-1);
//        cur = dummy;
//        for (int j = 0; j < map.size(); j++) {
//            cur.next = new ListNode(map.get(j));
//            cur = cur.next;
//        }
//        cur.next = null;
//        return dummy.next;
//
//    }
}
