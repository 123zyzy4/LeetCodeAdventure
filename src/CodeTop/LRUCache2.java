package CodeTop;

import java.util.HashMap;
import java.util.Map;

public class LRUCache2 {
    DNode dummy = new DNode(-1,-1);
    Map<Integer,DNode> map;
    int capacity;

    private class DNode{
        DNode pre;
        DNode next;
        int key,val;
        DNode(int key,int val){
            this.val = val;
            this.key = key;
        }
    }

    public LRUCache2(int capacity) {
        this.map = new HashMap<>();

        this.capacity = capacity;
        dummy.pre = dummy;
        dummy.next = dummy;

    }

    public int get(int key) {
        DNode node = getNode(key);
        return node==null?-1: node.val;
    }

    public void put(int key, int value) {
        DNode node = getNode(key);
        if(node!=null){
            node.val = value;
            return;
        }else {
            node = new DNode(key,value);
            putToFront(node);
            map.put(key,node);
            if(map.size()>capacity){
                DNode removeNode = dummy.pre;
                remove(removeNode);
                map.remove(removeNode.key);
            }
        }


    }

    private void remove(DNode node){
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }
    private void putToFront(DNode node){
        node.next = dummy.next;
        node.pre = dummy;
        node.next.pre = node;
        dummy.next = node;
    }

    private DNode getNode(int key){
        if(!map.containsKey(key)){
            return null;
        }
        DNode node = map.get(key);
        remove(node);
        putToFront(node);
        return node;
    }
}
