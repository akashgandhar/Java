package leetcode;

public class Q1752 {

  public static void main(String[] args) {
    int[] n = { 2, 1, 3, 4 };
    System.out.println(check(n));
  }

  public static boolean check(int[] arr) {
    int pivot = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        pivot = i + 1;
        break;
      }
    }

    int i = pivot + 1;
    while (i != pivot && i<arr.length) {
      if (arr[i] < arr[i - 1]) {
        return false;
      } else {
        i = i + 1 % arr.length;
      }
    }

    System.out.println(pivot);

    return true;
  }
}
