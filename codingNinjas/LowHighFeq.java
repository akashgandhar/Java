package codingNinjas;

import java.util.HashMap;
import java.util.Map.Entry;

public class LowHighFeq {

  public static void main(String[] args) {}

  public static int[] getFrequencies(int[] v) {
    HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
    for (int i : v) {
      hash.put(i, 0);
    }
    for (int i : v) {
      hash.put(i, hash.get(i) + 1);
    }

    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    int[] maxMin = { Integer.MIN_VALUE, Integer.MAX_VALUE };

    for (Entry<Integer, Integer> entry : hash.entrySet()) {
      if (entry.getValue() > max) {
        maxMin[0] = entry.getKey();
        max=entry.getValue();
      }else if(entry.getValue() == max){
        if(entry.getKey()<maxMin[0]){
            maxMin[0] = entry.getKey();
        }
      }
      if (entry.getValue() < min) {
        maxMin[1] = entry.getKey();
        min = entry.getValue();
      }else if(entry.getValue() == min){
        if(entry.getKey()<maxMin[1]){
            maxMin[1] = entry.getKey();
        }
      }
    }
    return maxMin;
  }
}
