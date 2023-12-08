package RandomProblem;

import org.testng.annotations.Test;

import java.util.*;

public class Solution103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int flag = 1;
        while(!queue.isEmpty()){
            List<Integer> sub = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode tmp = queue.poll();
                sub.add(tmp.val);

                if(tmp.left!=null){
                    queue.add(tmp.left);
                }
                if(tmp.right!=null){
                    queue.add(tmp.right);
                }

            }
            if(flag == -1){
                Collections.reverse(sub);
            }
            res.add(sub);
            flag = -flag;

        }
        return res;
    }
//    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//
//        List<List<Integer>> res = new ArrayList<>();
//        if(root==null){
//            return res;
//        }
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//        int flag = -1;
//        while(!queue.isEmpty()){
//            List<Integer> sub = new ArrayList<>();
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                TreeNode tmp = queue.poll();
//                sub.add(tmp.val);
//                if(flag==1){
//                    if(tmp.left!=null){
//                        queue.add(tmp.left);
//                    }
//                    if(tmp.right!=null){
//                        queue.add(tmp.right);
//                    }
//                }else{
//                    if(tmp.right!=null){
//                        queue.add(tmp.right);
//                    }
//                    if(tmp.left!=null){
//                        queue.add(tmp.left);
//                    }
//
//                }
//            }
//            res.add(sub);
//            flag = -flag;
//
//        }
//        return res;
//    }

    @Test
    private void test(){
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.right.left = new TreeNode(5);
        root1.left.left = new TreeNode(4);
        zigzagLevelOrder(root1);

    }
}



class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
     this.val = val;
     this.left = left;
     this.right = right;
    }
}
