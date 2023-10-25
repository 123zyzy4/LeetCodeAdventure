package day12;

public class Solution15 {

    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root){
        maxGain(root);
        return max;


    }
    private int maxGain(TreeNode root){
        if(root==null)return 0;

        int left = Math.max(maxGain(root.left),0);
        int right = Math.max(maxGain(root.right),0);

        max = Math.max(max,root.val+left+right);

        return root.val+Math.max(left,right);
    }

    //过了八十多个case，还行，瞎写的虽然是
    //虽然瞎写但是居然思路是正确的，没敢往下写可惜了
//    public int maxPathSum(TreeNode root) {
//        if(root==null)return Integer.MIN_VALUE;
//        if(root.left==null&&root.right==null)return root.val;
//
//
//        int left = find(root.left);
//        int right = find(root.right);
//        int res =  Math.max(Math.max(Math.max(Math.max(left,right),left+right+ root.val),left+root.val),right+root.val);
//        return Math.max(Math.max(maxPathSum(root.left),maxPathSum(root.right)),res);
//
//    }
//
//    private int find(TreeNode root){
//        if(root==null)return 0;
//        if(root.left==null&&root.right==null)return root.val;
//        return Math.max(find(root.left)+root.val,find(root.right)+root.val);
//
//    }
}
