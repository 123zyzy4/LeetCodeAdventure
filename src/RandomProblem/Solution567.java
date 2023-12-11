package RandomProblem;

import java.util.HashMap;


public class Solution567 {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (Character c : s1.toCharArray()) {
            map.put(c,map.getOrDefault(c, 0)+1);
        }
        int len1 = s1.length(),len2 = s2.length(),index = 0;
        while(index<len2){
            if(map.containsKey(s2.charAt(index))&&(len2-index)>=len1){
                HashMap<Character,Integer> tmp = new HashMap<>();
                for (int i = 0; i < len1; i++) {
                    char c_tmp = s2.charAt(index+i);
                    tmp.put(c_tmp,tmp.getOrDefault(c_tmp, 0)+1);
                }
                if(map.equals(tmp)){
                    return true;
                }
            }
            index++;
        }
        return false;
        
    }
}
