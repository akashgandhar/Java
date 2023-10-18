package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q54 {

  public static void main(String[] args) {
    int[][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    Q54 obj = new Q54();
    System.out.println(obj.spiralOrder(a));
  }

  public List<Integer> spiralOrder(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    int total = rows * cols;
    List<Integer> ans = new ArrayList<>();

    int left = 0;
    int right = cols - 1;
    int top = 0;
    int bottom = rows - 1;

    while (top <= bottom && left <= right) {
      //lefttoright
      for (int i = left; i <= right; i++) {
        if(total != ans.size()) ans.add(matrix[top][i]);
      }
      top++;

      //top to bottom
      for (int i = top; i <= bottom; i++) {
        if(total != ans.size()) ans.add(matrix[i][right]);
      }
      right--;

      //right to left
      for (int i = right; i >= left; i--) {
        if(total != ans.size()) ans.add(matrix[bottom][i]);
      }
      bottom--;

      //bottom to top
      for (int i = bottom; i >= top; i--) {
        if(total != ans.size()) ans.add(matrix[i][left]);
      }
      left++;
    }
    return ans;
  }
}
