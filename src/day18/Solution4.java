package day18;

import netscape.security.UserTarget;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution4 {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res = new ArrayList<>();
        int[] rightMax = new int[26];
        for (int i = 0; i < s.length(); i++) {
            rightMax[s.charAt(i)-'a'] = i;
        }
        int start = 0,end = 0;

        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end,rightMax[s.charAt(i)-'a']);
            if(i==end){
                res.add(end-start+1);
                start = end + 1;

            }
        }
        return res;
    }

//    private int partition(String s){
//
//        int rightMax = s.lastIndexOf(s.charAt(0));
//        int i=1;
//        while(i<rightMax){
//            rightMax = Math.max(rightMax,s.lastIndexOf(s.charAt(i)));
//            i++;
//            if(rightMax==s.length()-1){
//                return rightMax;
//            }
//        }
//        return rightMax;
//    }
}
