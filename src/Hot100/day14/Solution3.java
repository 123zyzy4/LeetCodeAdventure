package Hot100.day14;

import java.util.*;

public class Solution3 {
    List<String> res=new ArrayList<>();
    Map<Character, String> phoneMap = new HashMap<Character, String>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return new ArrayList<String>();
        }


        backtrack(digits,new StringBuffer(),0);
        return res;
    }

    private void backtrack(String digits, StringBuffer tmp,int cur){
        if(cur==digits.length()){
            res.add(tmp.toString());
            return;
        }

        int n;
        if(digits.charAt(cur)=='7'||digits.charAt(cur)=='9'){
            n=4;
        }else {
            n=3;
        }
        for (int i = 0; i < n; i++) {
//            char c = (char)((digits.charAt(cur) - '2') * 3 + 'a'+i);
            String letters = phoneMap.get(digits.charAt(cur));
            tmp.append(letters.charAt(i));
            backtrack(digits, tmp, cur+1);
            tmp.deleteCharAt(cur);
        }
    }
}
