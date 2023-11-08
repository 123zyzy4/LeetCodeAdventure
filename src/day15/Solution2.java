package day15;

public class Solution2 {

    //可以用一次二分做，就是需要通过取余得到当前数在矩阵中的位置
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null||matrix.length==0||matrix[0].length==0){
            return false;
        }
        int top = 0,bottom = matrix.length-1;
        int row = 0;
        while(top<=bottom){
           if(matrix[(top+bottom)/2][0]==target){
               return true;
           }else if(matrix[(top+bottom)/2][0]<target){
               top = (top+bottom)/2+1;
           }else {
               bottom = (top+bottom)/2-1;
           }
        }
        if(bottom<0)return false;
        int left= 0,right = matrix[0].length-1;
        while(left<=right){
            if(matrix[bottom][(left+right)/2]==target){
                return true;
            }else if(matrix[bottom][(left+right)/2]<target){
                left = (left+right)/2+1;
            }else {
                right = (left+right)/2-1;
            }
        }
        return false;

    }
}
