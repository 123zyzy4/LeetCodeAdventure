package day14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution7 {
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> partition(String s) {
        char[] charArray = s.toCharArray();
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int right = 0; right < s.length(); right++) {
            for (int left = 0; left <= right; left++) {
                if (charArray[left] == charArray[right] && (right - left <= 2 || dp[left + 1][right - 1])) {
                    dp[left][right] = true;
                }
            }
        }



        backtrack(s,new LinkedList<>(),0,dp);
        return res;
    }

    private void backtrack(String s, LinkedList<String> tmp, int cur,boolean[][] dp){
        if(cur==s.length()){
            res.add(new LinkedList<>(tmp));
            return;
        }

        for (int i = cur; i < s.length(); i++) {
//            if(judge(s,cur,i)){
//                tmp.add(s.substring(cur,i+1));
//                backtrack(s, tmp, i+1);
//                tmp.removeLast();
//            }
            if(dp[cur][i]){
                tmp.add(s.substring(cur,i+1));
                backtrack(s, tmp, i+1,dp);
                tmp.removeLast();
            }
        }


    }

//    private boolean judge(String s,int left,int right){
//        for (int i = 0; i < (right-left+1)/2; i++) {
//            if(s.charAt(left+i)!=s.charAt(right-i)){
//                return false;
//            }
//        }
//        return true;
//    }


}
