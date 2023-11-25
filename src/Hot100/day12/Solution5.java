package Hot100.day12;

public class Solution5 {
    int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {

        if(root==null||(root.left==null&&root.right==null)){
            return 0;
        }
        maxDepth(root);
        return res;
    }
    private int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        if((leftDepth+rightDepth)>res){
            res = leftDepth+rightDepth;
        }
        return Math.max(leftDepth,rightDepth)+1;
    }
}
