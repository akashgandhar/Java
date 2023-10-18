package codingNinjas;

import java.util.ArrayList;
import java.util.List;

public class MergeArrays {

  public static void main(String[] args) {
    int[] a = { 3, 3, 4, 5, 6, 7, 8, 9, 9, 9 };
    int[] b = { 2, 4, 10, 10 };
    System.out.println(sortedArray(a, b));
  }

  public static List<Integer> sortedArray(int[] a, int[] b) {
    // Write your code here
    List<Integer> res = new ArrayList<Integer>();
    int i = 0;
    int j = 0;
    int prev = -1;
    while (i < a.length && j < b.length) {
      if (a[i] != prev && b[j] != prev) {
        if (b[j] < a[i]) {
          res.add(b[j]);
          prev = b[j];
          j++;
        } else if (a[i] == b[j]) {
          res.add(a[i]);
          prev = a[i];
          i++;
          j++;
        } else {
          res.add(a[i]);
          prev = a[i];
          i++;
        }
      } else {
        if (prev == a[i]) {
          i++;
        }
        if (prev == b[j]) {
          j++;
        }
      }
    }
    if(i<a.length && a[i]!=prev){
        res.add( a[i]);
        prev = a[i];
    }else if(j<b.length && b[j]!=prev){
        res.add(b[j]);
        prev = b[j];
    }
    for (int i2 = i; i2 < a.length; i2++) {
      if (prev != a[i2]) {
        res.add(a[i2]);
      }
    }
    for (int j2 = j; j2 < b.length; j2++) {
      if (prev != b[j2]) {
        res.add(b[j2]);
      }
    }
    return res;
  }
}
