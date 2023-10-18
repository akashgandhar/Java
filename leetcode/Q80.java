package leetcode;

import java.util.Arrays;

public class Q80 {

  public static void main(String[] args) {
    int[] a = { 1, 1, 1, 2, 2, 3,3 };
    Q80 obj = new Q80();
    System.out.println(obj.removeDuplicates(a));
  }

  public int removeDuplicates(int[] nums) {
    int p1 = 0;
    int p2 = 1;
    int s = 0;

    while (p2 < nums.length) {
      if (nums[p1] == nums[p2]) {
        p2++;
        p1++;
      } else {
        nums[s] = nums[p1];
        p2++;
        p1++;
        s++;
      }
    }
    nums[s] = nums[nums.length - 1];

    System.out.println(Arrays.toString(nums));

    return s;
  }
}
