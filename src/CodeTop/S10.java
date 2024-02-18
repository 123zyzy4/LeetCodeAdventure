package CodeTop;

import org.testng.annotations.Test;

public class S10 {
    public String longestPalindrome(String s) {
        int maxLen = 0,begin = 0;

        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = true;
            maxLen = 1;
            begin = i;
        }
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1] = true;
                maxLen = 2;
                begin = i;
            }
        }
        for (int len = 3; len <= s.length(); len++) {
            for (int i = 0; i < s.length(); i++) {
                int j = i+len-1;
                if(j>=s.length()){
                    break;
                }
                if(s.charAt(i)==s.charAt(j)&&dp[i+1][j-1]){
                    dp[i][j] = true;
                    maxLen = len;
                    begin = i;
                }
            }
        }
        return s.substring(begin,begin+maxLen);
    }

    @Test
    public void test(){
        longestPalindrome("ccc");
    }
}
