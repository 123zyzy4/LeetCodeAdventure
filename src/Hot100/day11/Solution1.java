package Hot100.day11;

import java.util.HashMap;

public class Solution1 {

    HashMap<Node,Node> map =new HashMap<>();
    public Node copyRandomList(Node head) {
        if(head==null)return null;

        if(!map.containsKey(head)){
            Node newhead = new Node(head.val);
            map.put(head,newhead);
            newhead.next = copyRandomList(head.next);
            newhead.random = copyRandomList(head.random);
        }
        return map.get(head);


    }


    //虽然垃圾但是过了十几个case
    //代码又臭又长先不聊，加入了hashmap，你就说我通没通过吧
//    public Node copyRandomList(Node head) {
//        if(head==null)return null;
//        Node newhead = new Node(head.val);
//        Node cur1=head,cur2=newhead;
//        HashMap<Node,Node> map =new HashMap<>();
//
//        while(cur1.next!=null){
//            map.put(cur1,cur2);
//            cur1 = cur1.next;
//            cur2.next = new Node(cur1.val);
//            cur2 = cur2.next;
//        }
//        map.put(cur1,cur2);
//        cur2.next = null;
//
//        cur1 = head;
//        cur2 = newhead;
//        Node find = newhead;
//
//        while(cur2!=null){
//            if(cur1.random == null){
//                find =null;
//            }else {
////                int i = 0;
////                while(find!=null){
////                    if(find.val == cur1.random.val){
////                        break;
////                    }
////                    find = find.next;
////                    i++;
////                }
//                find = map.get(cur1.random);
//            }
//
//            cur2.random = find;
//            find = newhead;
//            cur1 = cur1.next;
//            cur2 = cur2.next;
//        }
//        return newhead;
//
//
//    }
}
