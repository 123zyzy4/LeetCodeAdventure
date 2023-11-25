package Hot100.day16;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution1 {
    public boolean isValid(String s) {
        if(s==null||s.length()==0){
            return true;
        }
        if(s.length()==1){
            return false;
        }
        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        Stack<Character> stack = new Stack<>();

        int i = 0;
        while(i<s.length()){
            char cur = s.charAt(i);
            if(cur=='('||cur=='['||cur=='{'){
                stack.push(cur);
                i++;
                continue;
            }else if(cur==')'||cur==']'||cur=='}'){
                if(stack.isEmpty()){
                    return false;
                }
                Character pre = stack.peek();
                if(map.get(pre)==cur){
                    stack.pop();
                    i++;
                    continue;
                }else{
                    return false;
                }
            }else {
                return false;
            }
        }
        if(i==s.length()&&stack.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}
