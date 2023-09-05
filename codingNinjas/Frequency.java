package codingNinjas;

import java.util.HashMap;

public class Frequency {

  public static void main(String[] args) {
    int[] arr = { 1, 3, 1, 9, 2, 7 };
    countFrequency(6, 0, arr);
  }

  public static int[] countFrequency(int n, int x, int[] nums) {
    HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
    for (int i : nums) {
      hash.put(i, 0);
    }
    for (int i : nums) {
      hash.put(i, hash.get(i) + 1);
    }
    int[] res = new int[n];
    for (int i = 0; i < res.length; i++) {
      if (hash.keySet().contains(i + 1)) {
        res[i] = hash.get(i + 1);
      } else {
        res[i] = 0;
      }
    }
    return new int[5];
  }
}
