package day7;

/**
 * @ClassName Solution2
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/28 7:52
 * @Version 1.0
 */
public class Solution2 {

    //没通过
//    public boolean searchMatrix(int[][] matrix, int target) {
//        int m= matrix.length;
//        int n= matrix[0].length;
//
//        int i=0,j=0;
//        while (i<m-1&&j<n-1&&matrix[i+1][j+1]<=target){
//            i++;
//            j++;
//        }
//
//
//
//        if(matrix[i][j]==target){
//            return true;
//        }
//        int x=i;
//
//        while(i<m-1){
//            if(matrix[i+1][j]==target){
//                return true;
//            }else {
//                i++;
//            }
//        }
//
//        i=x;
//        while(j<n-1){
//            if(matrix[i][j+1]==target){
//                return true;
//            }else {
//                j++;
//            }
//        }
//
//        return false;
//    }

    public boolean searchMatrix(int[][] matrix, int target){
        int i=0,j=matrix[0].length-1;

        while(i>=0&&j>=0&&i< matrix.length&&j<matrix[0].length){
            if(matrix[i][j]==target){
                return true;
            }else if(matrix[i][j]<target){
                i++;
            }else {
                j--;
            }

        }
        return false;
    }
}
