package RandomProblem;

import org.testng.annotations.Test;

public class Solution6 {
    public String convert(String s, int numRows) {
        if(numRows < 2) return s;
        char[] chars= s.toCharArray();
        String[] res = new String[numRows];
        for (int i = 0; i < numRows; i++) {
            res[i] = "";
        }
        int flag = -1;
        int index = 0;
        for (char c : chars) {
            res[index]+=c;

            if(index==0||index==numRows-1){
                flag = -flag;
            }
            index+=flag;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            sb.append(res[i]);
        }
        return sb.toString();
    }
//    public String convert(String s, int numRows) {
//        char[] chars= s.toCharArray();
//        char[][] n = new char[3][chars.length/3+1];
//        int x=0,y=0;
//        int count = 0;
//        for (char c : chars) {
//            n[x][y] = c;
//            x = x+1==3?0:x+1;
//            count++;
//            if(count%4==3||count%4==0){
//                y++;
//            }
//
//        }
//        StringBuffer sb = new StringBuffer();
//        for (int i = 0; i < y; i+=2) {
//            sb.append(n[0][i]);
//        }
//        for (int i = 0; i < y; i++) {
//            sb.append(n[1][i]);
//        }
//        for (int i = 0; i < y-1; i+=2) {
//            sb.append(n[2][i]);
//        }
//        if(x==3){
//            sb.append(n[x][y]);
//        }
//        return sb.toString();
//    }


}
