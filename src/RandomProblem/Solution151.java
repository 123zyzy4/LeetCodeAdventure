package RandomProblem;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution151 {
    //api的做法也很想试一下
    public String reverseWords(String s){
        //不trim会有一个空字符串""出现，然后join拼接的时候就会出现多一个空格的现象，因为空字符串也会需要一个“ ”拼接起来
        s = s.trim();
        List<String> list = Arrays.asList(s.split("\\s+"));
        Collections.reverse(list);
        return String.join(" ", list);

    }
//    public String reverseWords(String s) {
//        int left= s.length()-1,right = s.length()-1;
//        StringBuilder sb = new StringBuilder();
//        while(left>=0){
//            while(left>=0&&s.charAt(left)==' '){
//                left--;
//                right--;
//            }
////            while(left>=0&&((s.charAt(left)>='a'&&s.charAt(left)<='z')||(s.charAt(left)>='A'&&s.charAt(left)<='Z'))){
////                left--;
////            }
//            while(left>=0&&s.charAt(left)!=' '){
//                left--;
//            }
//            sb.append(s.substring(left+1,right+1));
//            if(left<right){
//                sb.append(' ');
//            }
//
//            left--;
//            right = left;
//
//        }
////        return sb.toString().trim();
//        String res = sb.toString();
//        return res.substring(0,res.length()-1);
//    }

    @Test
    private void test(){
        reverseWords("  Bob    Loves  Alice   ");
    }
}
