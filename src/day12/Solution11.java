package day12;

import java.util.ArrayList;
import java.util.List;

public class Solution11 {

    public void flatten(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        preorder(root,list);
        TreeNode cur = root;

        for (int i = 1; i < list.size(); i++) {
            cur.left = null;
            cur.right = list.get(i);
            cur = cur.right;
        }

    }

    private void preorder(TreeNode root,List<TreeNode> list){
        if(root==null)return;
        list.add(root);
        preorder(root.left, list);
        preorder(root.right, list);
    }
}
