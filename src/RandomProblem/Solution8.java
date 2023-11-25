package RandomProblem;

import org.testng.annotations.Test;

public class Solution8 {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0) return 0;
        int flag = 1;
        int index = 0;
        if(s.charAt(index)=='-'){
            flag = -1;
            index++;
        }else if(s.charAt(index)=='+'){
            flag = 1;
            index++;
        }
        int res = 0, bndry = Integer.MAX_VALUE / 10;
        while(index<s.length()){
            char c = s.charAt(index);
            if(c>='0'&&c<='9'){
                if (res > bndry || res == bndry && c > '7') return flag == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                res = res*10+c-'0';


            }else{
                return res*flag;
            }
            index++;
        }

        return res*flag;

    }
    @Test
    private void test(){
        int res = myAtoi("42");
        System.out.println(res);
    }
}
