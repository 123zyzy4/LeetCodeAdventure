package Hot100.day12;

public class Solution4 {
    public boolean isSymmetric(TreeNode root) {
        if(root==null||(root.left==null&&root.right==null)){
            return true;
        }

        return judge(root.left,root.right);

    }

    private boolean judge(TreeNode left,TreeNode right){
        if(left == null&&right == null){
            return true;
        }
        if(left == null||right == null){
            return false;
        }
        if(left.val == right.val){

            return judge(left.left, right.right)&&judge(left.right, right.left);
        }else {
            return false;
        }
    }
}
