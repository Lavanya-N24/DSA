package Sorting;

public class MergeSort {
 

    static void mergeSort(int[] arr, int low, int high) {

        if (low >= high) {
            return;
        }

        int mid = (low + high) / 2;

        // Sort left half
        mergeSort(arr, low, mid);

        // Sort right half
        mergeSort(arr, mid + 1, high);

        // Merge both halves
        merge(arr, low, mid, high);
    }

    static void merge(int[] arr, int low, int mid, int high) {

        int left = low;
        int right = mid + 1;

        int[] temp = new int[high - low + 1];

        int index = 0;

        // Compare elements from both halves
        while (left <= mid && right <= high) {

            if (arr[left] <= arr[right]) {
                temp[index] = arr[left];
                left++;
            } else {
                temp[index] = arr[right];
                right++;
            }

            index++;
        }

        // Remaining elements from left half
        while (left <= mid) {
            temp[index] = arr[left];
            left++;
            index++;
        }

        // Remaining elements from right half
        while (right <= high) {
            temp[index] = arr[right];
            right++;
            index++;
        }

        // Copy back to original array
        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }

    public static void main(String[] args) {

        int[] arr = {13, 46, 24, 52, 20, 9};

        mergeSort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

