package RandomProblem;

import Hot100.day10.ListNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Solution82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head,pre = null;
        while(cur.next!=null){
            if(cur.val == cur.next.val){

            }
        }


    }


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
