package day11;

public class Solution2 {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)return null;
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        int nullnum=0;
        int index = 0;
        while(true){
            int min = Integer.MAX_VALUE;
            nullnum = 0;
            for (int i = 0; i < lists.length; i++) {




                if(lists[i]!=null){
                    if(lists[i].val<min){
                        min = lists[i].val;
                        index = i;
                    }
                }else {
                    nullnum++;
                    if(nullnum == lists.length){

                        return dummy.next;
                    }
//                    if(i == lists.length-1){
//                        nullnum = 0;
//                    }
                }
            }

            cur.next = new ListNode(lists[index].val);
            lists[index] = lists[index].next;
            cur = cur.next;
        }


    }


}
