package codingNinjas;

public class LongestSubarray {

  public static void main(String[] args) {
    int[] a = { 2, 2, 4, 1, 2 };
    System.out.println(longestSubarrayWithSumK(a, 2));
  }

  public static int longestSubarrayWithSumK(int[] a, long k) {
    // Write your code here
    int max = Integer.MIN_VALUE;
    int sum = 0;
    int start = -1;
    int end = -1;
    
    for (int i = 0; i < a.length; i++) {
      sum += a[i];
      if(sum < 0){
        sum = 0;
      }
      if(sum == 0){
        start = i;
      }
      if(sum > k){
        max = 
      }
    }
  }  
}
