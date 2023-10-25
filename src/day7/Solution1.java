package day7;

/**
 * @ClassName day13.Solution1
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/28 8:28
 * @Version 1.0
 */
public class Solution1 {
    public void rotate(int[][] matrix) {
        int n=matrix.length;



        for (int i = 0; i < n/2; i++) {
            for (int j = 0; j < (n+1)/2; j++) {


                int temp=matrix[n-1-j][i];
                matrix[n-1-j][i]=matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j]=matrix[j][n-1-i];
                matrix[j][n-1-i]=matrix[i][j];
                matrix[i][j]=temp;



            }
        }

    }
}
