import java.util.Arrays;

public class MergeSort {

  public static void main(String[] args) {
    int[] nums = { 2, 13, 4, 1, 3, 6, 28 };
    mergeSort(nums, 0, nums.length-1);
    System.out.println(Arrays.toString(nums));
  }

  public static void mergeSort(int[] arr, int l, int h) {
    if (l >= h) {
      return;
    }
    int mid = l + (h - l) / 2;
    mergeSort(arr, l, mid);
    mergeSort(arr, mid + 1, h);
    merge(arr, l, mid, h);
  }

  public static void merge(int[] arr, int l, int m, int h) {
    int n1 = m - l + 1;
    int n2 = h - m;

    int[] left = new int[n1];
    int[] right = new int[n2];

    for (int i = 0; i < n1; i++) {
      left[i] = arr[l + i];
    }
    for (int i = 0; i < n2; i++) {
      right[i] = arr[m + 1 + i];
    }

    int i = 0;
    int j = 0;
    int k = l;

    while (i < n1 && j < n2) {
      if (left[i] < right[j]) {
        arr[k] = left[i];
        i++;
      } else {
        arr[k] = right[j];
        j++;
      }
      k++;
    }

    for (int k2 = i; k2 < n1; k2++) {
      arr[k] = left[k2];
      k++;
    }
    for (int k2 = j; k2 < n2; k2++) {
      arr[k] = right[k2];
      k++;
    }
  }
}
