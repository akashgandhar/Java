import java.util.Arrays;

/**
 * BubbleSort
 */
public class BubbleSort {

  public static void main(String[] args) {
    int[] nums = { 78, 1, 47, 5, 6 };
    bubbleSort(nums);
    System.out.println(Arrays.toString(nums));
  }

  public static void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }
}
