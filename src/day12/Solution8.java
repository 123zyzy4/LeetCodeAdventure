package day12;

public class Solution8 {


    public boolean isValidBST(TreeNode root) {
        return judge(root,Long.MIN_VALUE,Long.MAX_VALUE);

    }

    private boolean judge(TreeNode root,long min,long max) {
        if(root==null){
            return true;
        }
        if(root.val>=max||root.val<=min){
            return false;
        }
//
//        if(root.left!=null&&root.left.val>=root.val){
//            return false;
//        }
//        if(root.right!=null&&root.right.val<=root.val){
//            return false;
//        }
        return judge(root.left,min,root.val)&&judge(root.right,root.val,max);

    }
}
