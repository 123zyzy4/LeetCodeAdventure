package Hot100.day12;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution10 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root==null)return res;
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        while(!queue.isEmpty()){
            int currentlen = queue.size();
            for (int i = 0; i < currentlen; i++) {
                TreeNode tmp = queue.remove();
                if(tmp.left!=null){
                    queue.add(tmp.left);
                }
                if(tmp.right!=null){
                    queue.add(tmp.right);
                }
                if(i==currentlen-1){
                    res.add(tmp.val);
                }
            }
        }
        return res;


    }
}
