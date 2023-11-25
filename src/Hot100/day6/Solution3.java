package Hot100.day6;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Solution3
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/27 9:26
 * @Version 1.0
 */
public class Solution3 {
    public List<Integer> spiralOrder(int[][] matrix) {

        if(matrix==null||matrix.length==0) return null;
        List<Integer> res=new ArrayList<>();
        int left=0,right=matrix[0].length-1,up=0,down=matrix.length-1;
        int matrixNum=(right+1)*(down+1);
        while (left<=right&&up<=down){
            for (int i = left; i <= right&&matrixNum>=1; i++) {
                res.add(matrix[up][i]);
                matrixNum--;
            }
            up++;
            for (int i = up; i <= down&&matrixNum>=1; i++) {
                res.add(matrix[i][right]);
                matrixNum--;
            }
            right--;
            for (int i = right; i >=left&&matrixNum>=1 ; i--) {
                res.add(matrix[down][i]);
                matrixNum--;
            }
            down--;
            for (int i = down; i >=up&&matrixNum>=1 ; i--) {
                res.add(matrix[i][left]);
                matrixNum--;
            }
            left++;
        }

        return res;
    }



//    public List<Integer> spiralOrder(int[][] matrix) {
//        List<Integer> res=new ArrayList<>();
//        int left=0,right=matrix[0].length-1,up=0,down=matrix.length-1;
//
//        while (left<=right&&up<=down){
//            for (int i = left; i <= right; i++) {
//                res.add(matrix[up][i]);
//            }
//            up++;
//            for (int i = up; i <= down; i++) {
//                res.add(matrix[i][right]);
//            }
//            right--;
//            for (int i = right; i >=left ; i--) {
//                res.add(matrix[down][i]);
//            }
//            down--;
//            for (int i = down; i >=up ; i--) {
//                res.add(matrix[i][left]);
//            }
//            left++;
//        }
//
//        return res;
//    }
}
