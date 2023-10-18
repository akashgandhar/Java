package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q31 {

  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 4, 5, 6, 7 };
    Q31 obj = new Q31();
    obj.nextPermutation(a);
    // obj.reverse(a, 0, a.length );
    System.out.println(Arrays.toString(a));
  }

  public void nextPermutation(int[] nums) {
    int dip = -1;
    for (int i = nums.length - 2; i >= 0; i--) {
      if (nums[i] < nums[i + 1]) {
        dip = i;
        break;
      }
    }

    if (dip == -1) {
      reverse(nums, 0, nums.length - 1);
    }

    for (int i = nums.length - 1; i >= 0; i--) {
      if (nums[i] > nums[dip]) {
        int temp = nums[i];
        nums[i] = nums[dip];
        nums[dip] = temp;
        break;
      }
    }
    reverse(nums, dip + 1, nums.length - 1);
  }

  public  void reverse(int[] arr, int start, int end) {
    int i = start;
    int j = end;

    while (i < j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
  }
}
