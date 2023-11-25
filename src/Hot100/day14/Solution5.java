package Hot100.day14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution5 {
    List<String> res=new ArrayList<>();
    public List<String> generateParenthesis(int n) {

        backtrack(n,new StringBuffer(),0,0,0);
        return res;
    }

    private void backtrack(int n,StringBuffer tmp,int cur,int left,int right){
        if(tmp.length()== n*2){
            res.add(tmp.toString());
            return;
        }
        if(left<right){
            return;
        }
        if(left<n){
            tmp.append('(');
            backtrack(n, tmp,cur+1,left+1,right);
            tmp.deleteCharAt(tmp.length()-1);
        }
        if(right<n){
            tmp.append(')');
            backtrack(n, tmp,cur+1,left,right+1);
            tmp.deleteCharAt(tmp.length()-1);
        }


    }
}
