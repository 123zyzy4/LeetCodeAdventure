package Hot100.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName Solution2
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/17 9:00
 * @Version 1.0
 */
public class Solution2 {
    public List<Integer> findAnagrams(String s, String p) {
        if(s.length()<p.length())return new ArrayList<>();

        List<Integer> result=new ArrayList<>();
        int[] pCount=new int[26];
        int[] sCount=new int[26];
        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i)-'a']++;
            sCount[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(pCount,sCount)){
            result.add(0);
        }

        for (int i = 1; i <s.length()-p.length()+1; i++) {
            sCount[s.charAt(i-1)-'a']--;
            sCount[s.charAt(i+p.length()-1)-'a']++;
            if(Arrays.equals(pCount,sCount)){
                result.add(i);
            }
        }
        return result;
    }

}
