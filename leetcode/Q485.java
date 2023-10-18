package leetcode;

public class Q485 {

  public static void main(String[] args) {
    int[] nums = { 1, 1, 0, 1, 1, 1 };
    System.out.println(new Q485().findMaxConsecutiveOnes(nums));
  }

  public int findMaxConsecutiveOnes(int[] nums) {
    int max = 0;
    int current = 0;
    for (int i : nums) {
      if (i == 1) {
        current++;
      } else {
        if (current > max) {
          max = current;
          current = 0;
        } else {
          current = 0;
        }
      }
      if(current > max){
        max = current;
      }
    }
    return max;
  }
}
