package Hot100.day3;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName day13.Solution1
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/17 7:46
 * @Version 1.0
 */
public class Solution1 {
    public int lengthOfLongestSubstring(String s) {
        if(s==null||s.length()==0)return 0;

        Set<Character> set=new HashSet<>();

        int max=0;
        int j=-1;
        for (int i = 0; i < s.length(); i++) {

            if(i>0)set.remove(s.charAt(i-1));


            while(j+1<s.length()&&!set.contains(s.charAt(j+1))){
                set.add(s.charAt(++j));

            }
            max=Math.max(max,j-i+1);
        }

        return max;

    }
}
