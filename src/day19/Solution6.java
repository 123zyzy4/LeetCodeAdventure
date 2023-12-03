package day19;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution6 {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet = new HashSet(wordDict);
        int i = 0;
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        for (int j = 1; j <= s.length(); j++) {
            for (int k = 0; k < j; k++) {
                if(dp[k] && wordDict.contains(s.substring(k,j))){
                    dp[j] = true;
                }
            }
        }
        return dp[s.length()];

    }


}
