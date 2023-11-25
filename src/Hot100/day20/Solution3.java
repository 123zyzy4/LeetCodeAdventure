package Hot100.day20;

import java.util.Locale;

public class Solution3 {
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        boolean[][] dp = new boolean[s.length()][s.length()];
        int max = 1;
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = true;
        }

        for (int len = 2; len <= s.length(); len++) {
            for (int i = 0; i< s.length(); i++) {
                int j = len + i - 1;
                if(j>=s.length()){
                    break;
                }
                if(s.charAt(i)!=s.charAt(j)){
                    dp[i][j] = false;
                }else {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j-1];
                    }
                }

                if (dp[i][j] && j - i + 1 > max) {
                    max = j - i + 1;
                    index = i;
                }


            }
        }
        return s.substring(index,index+max);


    }

    //通过了二百多个，在ccc这个case以及类似连续重复字符就失效了
//    public String longestPalindrome(String s) {
//        char[] chars = s.toCharArray();
//        int[] dp = new int[s.length()];
//        dp[0] = 1;
//        int max = 1;
//        int index = 0;
//        for (int i = 1; i < s.length(); i++) {
//            if(chars[i-1]==chars[i]){
//                dp[i] = 2;
//            }
//            if(i-dp[i-1]-1>=0&&chars[i-dp[i-1]-1]==chars[i]){
//                dp[i] = dp[i-1]+2;
////                int j = i-2;
////                while(j>=0&&chars[j]==chars[i]){
////                    j--;
////
////                }
////                dp[i] = i-j+1;
//
//            }else {
//                if(dp[i]!=2){
//                    dp[i] = 1;
//                }
//
//            }
//            if(dp[i]>max){
//                max = Math.max(max,dp[i]);
//                index = i;
//            }
//
//
//        }
//        return s.substring(index-max+1,index+1);
//    }
}
