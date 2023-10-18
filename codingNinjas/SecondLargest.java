package codingNinjas;

import java.util.Arrays;

/**
 * SecondLargest
 */
public class SecondLargest {

  public static void main(String[] args) {
    int[] test = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    int[] res = getSecondOrderElements(10, test);
    System.out.println(Arrays.toString(res));
  }

  public static int[] getSecondOrderElements(int n, int[] a) {
    // Write your code here.
    int max = Integer.MIN_VALUE;
    int secMax = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int secMin = Integer.MAX_VALUE;

    for (int i = 1; i < n; i++) {
      if (a[i] > max) {
        secMax = max;
        max = a[i];
      } else if (a[i] < max && a[i] > secMax) {
        secMax = a[i];
      }
      if (a[i] < min) {
        secMin = min;
        min = a[i];
      } else if (a[i] > min && a[i] < secMin) {
        secMin = min;
      }
    }
    return new int[] { secMax, secMin };
  }
}
