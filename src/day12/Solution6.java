package day12;

import java.util.*;

public class Solution6 {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();
        if(root==null)return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> level = new ArrayList<Integer>();

            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode tmp = queue.remove();
                level.add(tmp.val);
                if(tmp.left!=null){
                    queue.add(tmp.left);
                }
                if(tmp.right!=null){
                    queue.add(tmp.right);
                }
            }
            res.add(level);
        }
        return res;
    }
}
