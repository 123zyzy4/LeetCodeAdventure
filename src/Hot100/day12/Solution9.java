package Hot100.day12;

public class Solution9 {
    public int kthSmallest(TreeNode root, int k) {
        if(root==null)return 0;
        int left = calculateNode(root.left);
        if(left==(k-1)){
            return root.val;
        }else if(left<(k-1)){
            return kthSmallest(root.right,k-left-1);
        }else {
            return kthSmallest(root.left,k);
        }

    }

    private int calculateNode(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }

        return calculateNode(root.left)+calculateNode(root.right)+1;
    }
}
