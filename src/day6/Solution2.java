package day6;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName Solution2
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/27 8:29
 * @Version 1.0
 */
public class Solution2 {
//    public void setZeroes(int[][] matrix) {
//        Set<Integer> rows=new HashSet<>();
//        Set<Integer> columns=new HashSet<>();
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                if(matrix[i][j]==0){
//                    rows.add(i);
//                    columns.add(j);
//                }
//            }
//        }
//
//        for (Integer row : rows) {
//            for (int i = 0; i < matrix[0].length; i++) {
//                matrix[row][i]=0;
//            }
//        }
//
//        for (Integer column : columns) {
//            for (int i = 0; i < matrix.length; i++) {
//                matrix[i][column]=0;
//            }
//        }
//    }

//    public void setZeroes(int[][] matrix){
//        boolean flagRow=false,flagCol=false;
//        for (int i = 0; i < matrix.length; i++) {
//            if(matrix[i][0]==0){
//                flagRow=true;
//            }
//        }
//
//        for (int i = 0; i < matrix[0].length; i++) {
//            if(matrix[0][i]==0){
//                flagCol=true;
//            }
//        }
//
//        for (int i = 1; i < matrix.length; i++) {
//            for (int j = 1; j < matrix[0].length; j++) {
//                if(matrix[i][j]==0){
//                    matrix[i][0]=matrix[0][j]=0;
//                }
//            }
//        }
//
//        for (int i = 1; i < matrix.length; i++) {
//            for (int j = 1; j < matrix[0].length; j++) {
//                if(matrix[i][0]==0||matrix[0][j]==0){
//                    matrix[i][j]=0;
//                }
//            }
//        }
//
//        if(flagRow){
//            for (int i = 0; i < matrix.length; i++) {
//                matrix[i][0]=0;
//            }
//        }
//
//        if(flagCol){
//            for (int i = 0; i < matrix[0].length; i++) {
//                matrix[0][i]=0;
//            }
//        }
//    }


    public void setZeroes(int[][] matrix){
        boolean flagRow=false;
        for (int i = 0; i < matrix.length; i++) {
            if(matrix[i][0]==0){
                flagRow=true;
            }

            for (int j = 1; j < matrix[0].length; j++) {
                if(matrix[i][j]==0){
                    matrix[i][0]=matrix[0][j]=0;
                }
            }
        }



        for (int i = matrix.length-1; i >= 0; i--) {
            for (int j = 1; j < matrix[0].length; j++) {
                if(matrix[i][0]==0||matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }

        if(flagRow){
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0]=0;
            }
        }


    }
}
