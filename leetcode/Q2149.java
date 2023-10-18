package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Q2149 {

  public static void main(String[] args) {
    int[] a = { -1, 1 };
    System.out.println(Arrays.toString(new Q2149().rearrangeArray(a)));
  }

  public int[] rearrangeArray(int[] nums) {
    int c1 = 0;
    int c2 = 1;
    int[] result = new int[nums.length];
    int i = 0;
    while (i < nums.length) {
      if (nums[i] > 0) {
        if (c1 < nums.length) {
          result[c1] = nums[i];
          c1 = c1 + 2;
        }
      } else {
        if (c2 < nums.length) {
          result[c2] = nums[i];
          c2 = c2 + 2;
        }
      }
      i++;
    }
    return result;
  }
  //   public int[] rearrangeArray(int[] nums) {
  //     int[] odds = new int[nums.length / 2];
  //     int[] evens = new int[nums.length / 2];
  //     int[] result = new int[nums.length];
  //     int c1 = 0;
  //     int c2 = 0;
  //     for (int i : nums) {
  //       if (i > 0) {
  //         odds[c1] = i;
  //         c1++;
  //       } else {
  //         evens[c2] = i;
  //         c2++;
  //       }
  //     }
  //     c1 = 0;
  //     c2 = 0;
  //     for (int i = 0; i < result.length; i++) {
  //       if (i % 2 == 0) {
  //         result[i] = odds[c1++];
  //       } else {
  //         result[i] = evens[c2++];
  //       }
  //     }
  //     return result;
  //   }
}
