package day8;

/**
 * @ClassName Solution4
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/29 9:55
 * @Version 1.0
 */
public class Solution4 {
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode head=new ListNode(-1);
//        ListNode cur=head;
//        while(list1!=null&&list2!=null){
//            if(list1.val<= list2.val){
//                cur.next=list1;
//                list1=list1.next;
//                cur=cur.next;
//            }else {
//                cur.next=list2;
//                list2=list2.next;
//                cur=cur.next;
//            }
//        }
//        if(list1!=null){
//            cur.next=list1;
//        }
//        if(list2!=null){
//            cur.next=list2;
//        }
//        return head.next;
//    }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        System.out.println("git1");
        System.out.println("git1");
        System.out.println("git1");

       if(list1==null||list2==null){
           return list1==null?list2:list1;
       }

       if(list1.val<= list2.val){
           list1.next=mergeTwoLists(list1.next,list2);
           return list1;
       }else {
           list2.next=mergeTwoLists(list1,list2.next);
           return list2;
       }




    }
}
