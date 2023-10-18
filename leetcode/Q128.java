package leetcode;

import java.util.HashSet;

public class Q128 {

  public static void main(String[] args) {
    int[] a = { 100, 4, 200, 1, 3, 2 };
    Q128 obj = new Q128();
    System.out.println(obj.longestConsecutive(a));
  }

  public int longestConsecutive(int[] nums) {
    if (nums.length == 0) return 0;
    HashSet<Integer> set = new HashSet<>();
    for (int i : nums) {
      set.add(i);
    }
    int max = 1;
    for (Integer num : set) {
      int n = num;
      int count = 1;
      if (!set.contains(n - 1)) {
        while (set.contains(n + 1)) {
          count++;
          n++;
        }
        max = Math.max(max, count);
      }
    }
    return max;
  }
}
