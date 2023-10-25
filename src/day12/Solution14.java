package day12;

public class Solution14 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null||root==p||root==q){
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);

//        if(left==null&&right==null){
//            return null;
//        }
        if(left==null){
            return right;
        }
        if(right==null){
            return left;
        }
        return root;
    }

    //写着写着写不下去了，才看到pq一定在树里面，我吐了
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if(root==null)return null;
//        if(root.val== p.val&&find(root,q)){
//            return p;
//        }
//        if(root.val== q.val&&find(root,p)){
//            return q;
//        }
//        if(find(root.left,p)&&find(root.right,q)){
//            return root;
//        }
//        TreeNode res1 = lowestCommonAncestor(root.left,p,q);
//        TreeNode res2 = lowestCommonAncestor(root.right,p,q);
//        if(TreeNode res = lowestCommonAncestor(root.left,p,q)!=null){
//
//        }
//        return lowestCommonAncestor(root.left,p,q);
//    }
//
//    private boolean find(TreeNode root,TreeNode target){
//        if(root==null)return false;
//
//        if(root.val==target.val){
//            return true;
//        }
//        return find(root.left,target)&&find(root.right,target);
//    }
}
