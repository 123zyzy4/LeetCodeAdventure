package CodeTop;

import Hot100.day1.test;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class S1 {
//    public int lengthOfLongestSubstring(String s) {
//        //滑动窗口
//        if(s==null||s.length()==0){
//            return 0;
//        }
//        int left = 0,right = 0;
//        int res = 1;
//
//        Set<Character> set = new HashSet<>();
//        set.add(s.charAt(0));
//        while(left<s.length()&&right<s.length()){
//
//            while(right+1<s.length()&&!set.contains(s.charAt(right+1))){
//                right++;
//                set.add(s.charAt(right));
//                res = Math.max(res,right-left+1);
//            }
//
//            set.remove(s.charAt(left));
//            left++;
//
//        }
//
//        return res;
//
//    }
    public int lengthOfLongestSubstring(String s) {

        if(s==null||s.length()==0){
            return 0;
        }
        int left,right = 0;
        int res = 1;

        Set<Character> set = new HashSet<>();
        set.add(s.charAt(0));

        for (left = 0; left < s.length(); left++) {
            if(left!=0){
                set.remove(s.charAt(left-1));
            }
            while(right+1<s.length()&&!set.contains(s.charAt(right+1))){
                right++;
                set.add(s.charAt(right));

            }
            res = Math.max(res,right-left+1);
        }

        return res;

    }

    @Test
    public void test(){
        lengthOfLongestSubstring("pwwkew");
    }
}
