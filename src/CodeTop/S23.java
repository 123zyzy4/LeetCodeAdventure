package CodeTop;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class S23 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int count = 0;
        int top = 0,bottom = matrix.length-1,left = 0,right = matrix[0].length-1;
        List<Integer> res = new ArrayList<>();
        while(top<=bottom&&left<=right){
            for (int i = left; i <= right&&count< matrix.length*matrix[0].length; i++) {
                res.add(matrix[top][i]);
                count++;
            }
            top++;
            for (int i = top; i <= bottom&&count< matrix.length*matrix[0].length; i++) {
                res.add(matrix[i][right]);
                count++;
            }
            right--;
            for (int i = right; i >=left&&count< matrix.length*matrix[0].length; i--) {
                res.add(matrix[bottom][i]);
                count++;
            }
            bottom--;
            for (int i = bottom; i >= top&&count< matrix.length*matrix[0].length ; i--) {
                res.add(matrix[i][left]);
                count++;
            }
            left++;
        }
        return res;
    }

    @Test
    public void test(){
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        spiralOrder(matrix);
    }
}
