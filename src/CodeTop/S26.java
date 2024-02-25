package CodeTop;

public class S26 {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int cur1 = num1.length()-1,cur2 = num2.length()-1,add = 0;
        while(cur1>=0||cur2>=0||add!=0){
            int i1  = cur1>=0?num1.charAt(cur1)-'0':0;
            int i2  = cur2>=0?num2.charAt(cur2)-'0':0;
            cur1--;
            cur2--;
            sb.append((i1+i2+add)%10);
            add = (i1+i2+add)/10;

        }
        sb.reverse();
        return sb.toString();

    }
}
