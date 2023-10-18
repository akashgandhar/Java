package codingNinjas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Superior {

  public static void main(String[] args) {
    int[] a = { 1,2,2,1 };
    List<Integer> ans = superiorElements(a);
    System.out.println(Arrays.toString(ans.toArray()));
  }

  public static List<Integer> superiorElements(int[] a) {
    // Write your code here.
    List<Integer> ans = new ArrayList<Integer>();
    ans.add(a[a.length - 1]);
    int max = a[a.length - 1];
    for (int i = a.length - 2; i >= 0; i--) {
      if (a[i] > max) {
        ans.add(a[i]);
        max = a[i];
      }
    }
    return ans;
  }
}
