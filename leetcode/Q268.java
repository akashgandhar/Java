package leetcode;

public class Q268 {

  public static void main(String[] args) {
    int[] nums = { 3,0,1 };
    System.out.println(new Q268().missingNumber(nums));
  }

  public int missingNumber(int[] nums) {
    int n = nums.length ;
    int sum = (n * (n + 1)) / 2;
    int tempSum = 0;
    for (int i : nums) {
      tempSum += i;
    }

    return sum - tempSum;
  }
}
