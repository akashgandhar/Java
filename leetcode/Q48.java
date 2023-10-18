package leetcode;
import java.util.Arrays;

public class Q48 {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        Q48 obj = new Q48();
        obj.rotate(a);
        System.out.println(Arrays.deepToString(a));
    }
    
    public void rotate(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i <rows ; i++) {
            for (int j = i+1; j < cols; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] =  matrix[i][cols - j -1];  
                matrix[i][cols - j - 1] = temp;
            }
        }
    }
}
