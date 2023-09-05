import java.util.Arrays;

public class QuickSort {

  public static void main(String[] args) {
    int[] nums = { 4, 3, 8, 4, 6, 5 };
    quickSort(nums, 0, nums.length - 1);
    System.out.println(Arrays.toString(nums));
  }

    public static void quickSort(int[] arr, int l, int r) {
        if (r <= l) {
        return;
        }
        int part = partition(arr, l, r);
        quickSort(arr, l, part-1);
        quickSort(arr, part + 1, r);
    }

    public static int partition(int[] arr, int l, int r) {
        int pivot = arr[l];
        int i = l;
        int j = r;

        while (i < j) {
        while (arr[i] <= pivot && i <= r-1) {
            i++;
        }
        while (arr[j] > pivot && j >= l+1) {
            j--;
        }
        if (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        }

        int temp = arr[j];
        arr[j] = arr[l];
        arr[l] = temp;
        return j;
    }
    }
