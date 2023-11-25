package Hot100.day11;

import java.util.HashMap;


//你就说通没通过吧！
public class LRUCache {
    private int capacity;
    private int num;
    private ListNode dummy,end;
    private HashMap<Integer,Integer> map = new HashMap<>();
    public LRUCache(int capacity) {
        this.num = 0;
        this.capacity = capacity;
        this.dummy = new ListNode(-1);
        this.end = dummy;

    }

    public int get(int key) {
        if(map.containsKey(key)){
            ListNode node = new ListNode(key);
            end.next = node;
            end = node;
            ListNode cur = dummy.next,pre = dummy;
            while(cur!=end){
                if(cur==null){
                    break;
                }
                if(cur.val == key){
                    pre.next = cur.next;



                    cur = cur.next;
                }else {
                    pre = cur;
                    cur = cur.next;
                }
            }

            return map.get(key);
        }else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if(!map.containsKey(key)){
            num++;
        }
        map.put(key,value);

        ListNode node = new ListNode(key);
        end.next = node;
        end = node;
        ListNode cur = dummy.next,pre = dummy;

        while(cur!=end){
            if(cur==null){
                break;
            }
            if(cur.val == key){
                pre.next = cur.next;



                cur = cur.next;
            }else {
                pre = cur;
                cur = cur.next;
            }
        }
        if(num > capacity){
            map.remove(dummy.next.val);
            dummy.next = dummy.next.next;
            num--;
        }
    }
}
