package day14;

import java.util.ArrayList;
import java.util.List;

public class Solution6 {

    //想省空间的话就在char数组基础上做Boolean数组，具体来说就是board[i][j] = '\0';board[i][j] = word[k];这样先改变后返回，不多写了。
    public boolean exist(char[][] board, String word) {

        boolean[][] visit = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(backtrack(board,word,new StringBuffer(),i,j,visit)){
                    return true;
                }
            }
        }
        return false;

    }

    private boolean backtrack(char[][] board,String word,StringBuffer tmp,int i,int j,boolean[][] visit){
        if(tmp.length()== word.length()){

            return true;
        }
        if(i<0||i>= board.length||j<0||j>=board[0].length){
            return false;
        }
        if(visit[i][j]){
            return false;
        }
        if(board[i][j]!=word.charAt(tmp.length())){
            return false;
        }
        tmp.append(board[i][j]);

        visit[i][j]=true;
        boolean judge1 = backtrack(board, word, tmp, i+1, j,visit);
        boolean judge2 = backtrack(board, word, tmp, i-1, j,visit);
        boolean judge3 = backtrack(board, word, tmp, i, j+1,visit);
        boolean judge4 = backtrack(board, word, tmp, i, j-1,visit);
        visit[i][j]=false;
        tmp.deleteCharAt(tmp.length() - 1);
        return judge1||judge2||judge3||judge4;

    }












//    public boolean exist(char[][] board, String word) {
//
//        boolean[][] visit = new boolean[board.length][board[0].length];
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[0].length; j++) {
//                if(backtrack(board,word,new StringBuffer(),i,j,visit,0)){
//                    return true;
//                }
//            }
//        }
//        return false;
//
//    }
//
//    private boolean backtrack(char[][] board,String word,StringBuffer tmp,int i,int j,boolean[][] visit,int cur){
//        if(cur== word.length()){
//
//            return true;
//        }
//        if(i<0||i>= board.length||j<0||j>=board[0].length){
//            return false;
//        }
//        if(visit[i][j]){
//            return false;
//        }
//        if(board[i][j]!=word.charAt(cur)){
//            return false;
//        }
//        tmp.append(board[i][j]);
//
//        visit[i][j]=true;
//        boolean judge1 = backtrack(board, word, tmp, i+1, j,visit,cur+1);
//        boolean judge2 = backtrack(board, word, tmp, i-1, j,visit,cur+1);
//        boolean judge3 = backtrack(board, word, tmp, i, j+1,visit,cur+1);
//        boolean judge4 = backtrack(board, word, tmp, i, j-1,visit,cur+1);
//        visit[i][j]=false;
//
//        return judge1||judge2||judge3||judge4;
//
//    }
}
