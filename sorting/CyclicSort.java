import java.util.Arrays;

public class CyclicSort {

  public static void main(String[] args) {
    int[] nums = { 3, 5, 2, 1, 4 };
    cyclicSort(nums);
    System.out.println(Arrays.toString(nums));
    // int n = binarySearch(nums,2);
    // System.out.println(n);
  }

  public static void cyclicSort(int[] arr) {
    for (int i = 0; i < arr.length;) {
      int index = arr[i] - 1;
      if (arr[i] != arr[index]) {
        int temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
      } else {
        i++;
      }
    }
  }
  
}
