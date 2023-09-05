import java.util.Arrays;

public class SelectionSort {

  public static void main(String[] args) {
    int[] nums = { 2, 13, 4, 1, 3, 6, 28 };
    selectionSort(nums);
    System.out.println(Arrays.toString(nums));
  }

  public static void selectionSort(int[] arr) {
    int length = arr.length - 1;

    while (length >= 0) {
      int max = 0;
      for (int i = 0; i <= length; i++) {
        if (arr[i] > arr[max]) {
          max = i;
        }
      }
      int temp = arr[max];
      arr[max] = arr[length];
      arr[length] = temp;

      length--;
    }
  }
}
