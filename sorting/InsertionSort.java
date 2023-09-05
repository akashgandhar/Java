import java.util.Arrays;

public class InsertionSort {

  public static void main(String[] args) {
    int[] nums = { 78, 1, 47, 5, 6 };
    insertionSort(nums);
    System.out.println(Arrays.toString(nums));
  }

  public static void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int index = 0;
      for (int j = 0; j <= i; j++) {
        if (arr[i] > arr[j]) {
          index++;
        } else {
          break;
        }
      }
      int temp = arr[i];
      arr[i] = arr[index];
      arr[index] = temp;
    }
  }
}
