package day12;

public class Solution3 {
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }

    private void invert(TreeNode root){
        if(root==null||(root.left==null&&root.right==null)){
            return;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invert(root.left);
        invert(root.right);
    }
}
