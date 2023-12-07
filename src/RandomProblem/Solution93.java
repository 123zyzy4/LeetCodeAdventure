package RandomProblem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution93 {
    List<String> res = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        backtrack(s, 0, new LinkedList<>());
        return res;
    }
    private void backtrack(String s,int i,LinkedList<Integer> tmp){
        if(i==s.length()&&tmp.size()==4){
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < 3; j++) {
                
                sb.append(tmp.get(j));
                sb.append(".");
                
            }
            sb.append(tmp.get(3));
            res.add(sb.toString());
            return;
        }
        if(i>=s.length()||tmp.size()>=4){
            return;
        }
        for (int j = 1; j <= 3; j++) {
            if((i+j)>s.length()){
                break;
            }
            String sub = s.substring(i, i+j);
            if(sub.charAt(0)=='0'&&sub.length()>1){
                break;
            }
            int num = Integer.parseInt(sub);
            if(num>255){
                break;
            }
            tmp.add(num);
            backtrack(s, i+j, tmp);
            tmp.removeLast();
        }

    }
}
