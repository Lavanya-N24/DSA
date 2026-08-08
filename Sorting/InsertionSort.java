package Sorting;

public class InsertionSort {
  

    static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            // Move larger elements one position to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert key at correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        int[] arr = {13, 46, 24, 52, 20, 9};

        insertionSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

   