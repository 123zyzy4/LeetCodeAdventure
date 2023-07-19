package day4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName Solution2
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/18 9:08
 * @Version 1.0
 */
public class Solution2 {
//    public String minWindow(String s, String t) {
//        char[] sCHars = s.toCharArray();
//        char[] tCHars = t.toCharArray();
//        Map<Character,Integer> map=new HashMap<>();
//
//        int left=0,right=0;
//        while(right<sCHars.length){
//            map.put(sCHars[right],map.getOrDefault(sCHars[right],0)+1);
//            if(!check1(map,tCHars)) {
//                right++;
//            }else {
//                break;
//            }
//        }
//        if(right==sCHars.length)return null;
//
//        while (check2(map,tCHars)){
//            map.put(sCHars[left],map.getOrDefault(sCHars[left],0)-1);
//            left++;
//
//        }
//        left--;
//        return s.substring(left,right+1);
//
//
//    }
//
//    private Boolean check1(Map<Character,Integer> map,char[] tCHars){
//        for (char c : tCHars) {
//            if(!map.containsKey(c))return false;
//        }
//        return true;
//    }
//
//    private Boolean check2(Map<Character,Integer> map,char[] tCHars){
//        for (char c : tCHars) {
//            if(map.get(c)<=0)return false;
//        }
//        return true;
//    }

    public String minWindow(String s, String t){

        if (s == null || s.length() == 0 || t == null || t.length() == 0){
            return "";
        }
        int[] need=new int[52];
        for (int i = 0; i <t.length(); i++) {
            need[t.charAt(i)-'A']=1;
        }
        int left=0,right=0,min=Integer.MAX_VALUE,start=0,count=t.length();
        while(right<s.length()){

            if(need[s.charAt(right)-'A']>0){
                count--;
            }
            need[s.charAt(right)-'A']--;

            if(count==0){
                while(left<right&&need[s.charAt(left)-'A']<0){
                    need[s.charAt(left)-'A']--;
                    left++;
                }
                if(right-left+1<min){
                    min=right-left+1;
                    start=left;
                }
                need[s.charAt(right)-'A']++;
                left++;
                count++;
            }
            right++;
        }
        return min == Integer.MAX_VALUE ? "" : s.substring(start, start + min);

    }

}
