package leetcode;

import java.util.Arrays;

public class Q1482 {

  public static void main(String[] args) {
    int[] a = { 1,10,3,10,2 };
    Q1482 obj = new Q1482();
    System.out.println(obj.minDays(a, 3, 1));
  }

  public int minDays(int[] bloomDay, int m, int k) {
    if (bloomDay.length < m * k) {
      return -1;
    }
    int flowers = 0;
    int days = 0;

    while (flowers <= (m * k)) {
      int min = 0;
      for (int i = 0; i < bloomDay.length; i++) {
        if (bloomDay[i] < bloomDay[min]) {
          min = i;
        }
      }
      days = bloomDay[min];
      int minnum = bloomDay[min];
      for (int i = 0; i < bloomDay.length; i++) {
        if (bloomDay[i] == minnum) {
          flowers++;
          bloomDay[i] = Integer.MAX_VALUE;
        }
      }
    }
    return days;
  }
}
