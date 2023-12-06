package RandomProblem;

import java.util.HashSet;

class Solution36{
    public boolean isValidSudoku(char[][] board) {
        int[][] row = new int[9][9];
        int[][] column = new int[9][9];
        int[][][] square = new int[3][3][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(board[i][j]!='.'){
                    int index = board[i][j]-'0'-1;
                    row[i][index]++;
                    column[j][index]++;
                    square[i/3][j/3][index]++;
                    if(row[i][index]>=2||column[j][index]>=2||square[i/3][j/3][index]>=2){
                        return false;
                    }

                }
            }
        }
        return true;
        

    }
    //纯暴力解，烂中烂
    // public boolean isValidSudoku(char[][] board) {
        
    //     HashSet<Character> row = new HashSet<>();
    //     HashSet<Character> column = new HashSet<>();
        
    //     for (int i = 0; i < board.length; i++) {
    //         for (int j = 0; j < board[0].length; j++) {
    //             if(board[i][j]!='.'){
    //                 if(row.contains(board[i][j])){
    //                     return false;
    //                 }else{
    //                     row.add(board[i][j]);
    //                 }
                    
    //             }
    //             if(board[j][i]!='.'){
    //                 if(column.contains(board[j][i])){
    //                     return false;
    //                 }else{
    //                     column.add(board[j][i]);
    //                 }
    //             }
                
    //         }
    //         row.clear();
    //         column.clear();
    //     }
    //     for (int i = 0; i < board.length/3; i++) {
    //         for (int j = 0; j < board.length/3; j++) {
    //             if(!judgeSquare(board,i,j)){
    //                 return false;
    //             }
    //         }
    //     }
        
    //     return true;
    // }
    // private boolean judgeSquare(char[][] board,int x,int y){
    //     HashSet<Character> square = new HashSet<>();
    //     for (int i = x*3; i < x*3+3; i++) {
    //         for (int j = y*3; j < y*3+3; j++) {
    //             if(board[i][j]!='.'){
    //                 if(square.contains(board[i][j])){
    //                     return false;
    //                 }else{
    //                     square.add(board[i][j]);
    //                 }
    //             }
                
    //         }
    //     }
    //     return true;
    // }
}