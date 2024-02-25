package CodeTop;

import org.testng.annotations.Test;

import java.util.*;

//没有s20因为LRU这道题类名不能是sxx
public class S21 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();
        if(root==null)return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int flag = 1;
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> sub = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode tmp = queue.poll();
                sub.add(tmp.val);
                if (tmp.left != null) {
                    queue.add(tmp.left);
                }
                if (tmp.right != null) {
                    queue.add(tmp.right);
                }


            }
            if(flag<0){
                Collections.reverse(sub);
            }
            flag = -flag;
            res.add(sub);
        }
        return res;
    }

    @Test
    public void test(){
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(9);
        TreeNode t3 = new TreeNode(20);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        t1.left = t2;
        t1.right = t3;
        t2.left = null;
        t2.right = null;
        t3.left = t4;
        t3.right = t5;
        t4.left = null;
        t4.right = null;
        t5.left = null;
        t5.right = null;
        zigzagLevelOrder(t1);


    }

}
