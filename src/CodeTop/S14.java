package CodeTop;

import java.util.Stack;

public class S14 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int cur = 0;
        while(cur<s.length()){
            char c = s.charAt(cur);

            if(c=='('||c=='['||c=='{'){
                stack.push(c);
            }else {
                if(stack.isEmpty()){
                    return false;
                }
                char pre = stack.pop();
                if(c==')'&&pre!='('){
                    return false;
                }else if(c==']'&&pre!='['){
                    return false;
                }else if(c=='}'&&pre!='{'){
                    return false;
                }

            }
            cur++;
        }
        return stack.isEmpty()?true:false;
    }
}
