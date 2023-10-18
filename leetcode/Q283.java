package leetcode;

import java.util.Arrays;

public class Q283 {

  public static void main(String[] args) {
    int[] nums = { 0, 1, 0, 3, 12 };
    new Q283().moveZeroes(nums);
    System.out.println(Arrays.toString(nums));
  }

  public void moveZeroesLeft(int[] nums) {
    int c = nums.length - 1;
    for (int i = nums.length - 1; i >= 0; i--) {
      if (nums[i] != 0) {
        int temp = nums[i];
        nums[i] = nums[c];
        nums[c] = temp;
        c--;
      }
    }
  }
  public void moveZeroes(int[] nums) {
    int c = 0;
    for (int i = 0; i <nums.length; i++) {
      if (nums[i] != 0) {
        int temp = nums[i];
        nums[i] = nums[c];
        nums[c] = temp;
        c++;
      }
    }
  }

}
