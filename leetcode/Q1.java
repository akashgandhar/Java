package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Q1 {

  public static void main(String[] args) {
    int[] a = { 2, 7, 11, 15 };
    System.out.println(Arrays.toString(new Q1().twoSum(a, 9)));
  }

  public int[] twoSum(int[] nums, int target) {
    int i = 0;
    int j = nums.length - 1;
    for (int j2 = 0; j2 < nums.length; j2++) {
      if (nums[i] + nums[j] == target) {
        return new int[] { i, j };
      } else if (nums[i] + nums[j] < target) {
        i++;
      } else {
        j--;
      }
    }

    return new int[] { -1, -1 };
  }
  //   public int[] twoSum(int[] nums, int target) {
  //     HashMap<Integer, Integer> map = new HashMap<>();
  //     for (int i = 0; i < nums.length; i++) {
  //       if (map.containsKey((target - nums[i]))) {
  //         return new int[] { map.get((target - nums[i])), i };
  //       } else {
  //         map.put(nums[i], i);
  //       }
  //     }
  //     return new int[] { -1, -1 };
  //   }
}
