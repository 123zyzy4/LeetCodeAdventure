package day12;

public class Solution12 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,inorder,0, preorder.length-1,0, preorder.length-1);
    }

    private TreeNode build(int[] preorder, int[] inorder,int left1,int right1,int left2,int right2){
        if(left1>right1)return null;
        TreeNode node = new TreeNode(preorder[left1]);
        if(left1 == right1)return node;
        int target = preorder[left1];
        int i = left2;
        while(inorder[i]!=preorder[left1]){
            i++;
        }

        node.left = build(preorder, inorder, left1+1, left1+i-left2, left2, i-1);
        node.right = build(preorder, inorder, right1-(right2-i-1), right1, i+1, right2);
        return node;

    }
}
