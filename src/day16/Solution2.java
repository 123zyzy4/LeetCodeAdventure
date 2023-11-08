package day16;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Stack;

public class Solution2 {
    int cur=0;
    public String decodeString(String s) {
        Stack<Integer> num_stack = new Stack<>();
        Stack<Character> char_stack = new Stack<>();
        Stack<String> stack = new Stack<>();
        while(cur<s.length()){
            char c = s.charAt(cur);
            if(Character.isDigit(c)){
                stack.push(getNum(s));
            }else if(c=='['||Character.isLetter(c)){
                stack.push(String.valueOf(s.charAt(cur++)));
            }else{
                cur++;
                LinkedList<String> tmp = new LinkedList<>();
                while(!stack.peek().equals(String.valueOf('['))){
                    tmp.add(stack.pop());
                }
                stack.pop();
                Collections.reverse(tmp);

                StringBuffer sb = new StringBuffer();

                int num = Integer.parseInt(stack.pop());
                String o = getString(tmp);
                for (int i = 0; i < num; i++) {
                    sb.append(o);
                }
                stack.push(sb.toString());
            }

        }
        StringBuffer res = new StringBuffer();
        while (!stack.isEmpty()) {
            String element = stack.pop();
            res.insert(0, element);
        }
        return res.toString();
    }

    private String getNum(String s){
        StringBuffer res = new StringBuffer();
        while (Character.isDigit(s.charAt(cur))) {
            res.append(s.charAt(cur++));
        }
        return res.toString();

    }

    private String getString(LinkedList<String> v) {
        StringBuffer res = new StringBuffer();
        for (String s : v) {
            res.append(s);
        }
        return res.toString();
    }


}
