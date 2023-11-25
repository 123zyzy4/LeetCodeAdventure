package Hot100.day19;

public class Solution10 {
    public int longestValidParentheses(String s) {
        int[] dp =new int[s.length()];
        int max = 0;
        for (int i=1;i<s.length();i++) {
            char c = s.charAt(i);
            if(c==')'){
                if(s.charAt(i-1)=='('){
                    dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2;
                }else if((i-1-dp[i-1]>=0)&&(s.charAt(i - dp[i - 1] - 1) == '(')){
                    dp[i] = dp[i-1]+2+((i - dp[i - 1]) >= 2 ? dp[i - dp[i - 1] - 2] : 0);
                }
            }
            max = Math.max(max,dp[i]);
        }
        return dp[s.length()-1];

    }
}
