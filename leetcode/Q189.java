package leetcode;

import java.util.Arrays;

public class Q189 {

  public static void main(String[] args) {
    int[] nums = { 1,2 };
    int k = 3;
    new Q189().rotate(nums, k);
    System.out.println(Arrays.toString(nums));
  }

  public void rotate(int[] nums, int k) {
    int r = k % nums.length;
    if (r > 0) {
      int[] newArray = new int[r];

      int c = 0;
      for (int i = nums.length - r; i < nums.length; i++) {
        newArray[c++] = nums[i];
      }

      for (int i = nums.length - r - 1; i >= 0; i--) {
        nums[i + r] = nums[i];
      }

      for (int i = 0; i < r; i++) {
        nums[i] = newArray[i];
      }
    }
  }
}
