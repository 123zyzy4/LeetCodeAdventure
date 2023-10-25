package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1 {
    List<Integer> res = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {

//        if(root == null||(root.left==null&&root.right==null)){
//            res.add(root.val);
//            return res;
//        }
        inorder(root);
        return res;

    }

    private void inorder(TreeNode root){
        if(root == null){

            return;
        }
        inorder(root.left);
        res.add(root.val);
        inorder(root.right);
    }
}
