public class InsertionSort {

  public static void sort(int[] arr) {
    int n = arr.length;
    for (int j = 1; j < n; j++) {
      int key = arr[j];
      int i = j - 1;

      while (i > -1 && arr[i] > key) {
        arr[i + 1] = arr[i];
        i--;
      }
      arr[i + 1] = key;
    }
  }

  public static void main(String[] args) {
    int[] arr = {9, 13, 3, 2, 12, 64, 58, 22};
    System.out.println("Before Insertion Sort:");
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();

    sort(arr);

    System.out.println("After Insertion Sort:");
    for (int i : arr) {
      System.out.print(i + " ");
}
      
  }
}
