package RandomProblem;

import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.Queue;

public class Solution116 {
    public Node connect(Node root) {
        if(root==null){
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            Node pre = queue.poll();
            Node cur;


            for (int i = 0; i < size-1; i++) {
                cur = queue.poll();
                pre.next = cur;
                if(pre.left!=null){
                    queue.add(pre.left);
                }
                if(pre.right!=null){
                    queue.add(pre.right);
                }
                pre = cur;

            }
            pre.next = null;
            if(pre.left!=null){
                queue.add(pre.left);
            }
            if(pre.right!=null){
                queue.add(pre.right);
            }



        }
        return root;
    }

    @Test
    private void test(){
        // 测试用例 1: 给定一个完全填充的树 [1,2,3,4,5,6,7]
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.left = new Node(6);
        root1.right.right = new Node(7);

        System.out.println("测试用例 1：");
        connect(root1); // 调用填充函数

    }
}



// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
