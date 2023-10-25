package day12;

public class Solution7 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums==null||nums.length==0)return null;


        return build(nums,0, nums.length-1);

    }

    private TreeNode build(int[] nums,int left,int right){
        if(left>right){
            return null;
        }
        if(left == right){
            return new TreeNode(nums[left]);
        }
        TreeNode root = new TreeNode(nums[(left+right)/2]);
        root.left = build(nums,left,(left+right)/2-1);
        root.right = build(nums,(left+right)/2+1,right);
        return root;

    }
}
