package leetcode;

public class Q1752 {
    public static void main(String[] args) {
        int[] n = {2,1,3,4};
        System.out.println(check(n));
    }

  public static boolean check(int[] nums) {
    int min = 0;
    int max = 0;
    
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > nums[max]) {
        max = i;
      }
      if (nums[i] < nums[min]) {
        min = i;
      }
    }

    for (int i = 0; i < max - 1; i++) {
      if (nums[i] > nums[i + 1]) {
        return false;
      }
    }
    for (int i = min; i < nums.length - 2; i++) {
      if (nums[i] > nums[i + 1]) {
        return false;
      }
    }
    return true;
  }
}
