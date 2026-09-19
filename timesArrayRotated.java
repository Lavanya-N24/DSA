public class timesArrayRotated {

    public static void main(String[] args) {

        int arr[] = {4, 5, 6, 7, 0, 1, 2};

        int n = arr.length;

        int count = countRotations(arr, n);

        System.out.println("The array is rotated " + count + " times.");
    }

    public static int countRotations(int[] arr, int n) {

        int low = 0;
        int high = n - 1;

        int ans = Integer.MAX_VALUE;
        int index = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // Current range is completely sorted
            if (arr[low] <= arr[high]) {

                if (arr[low] < ans) {
                    ans = arr[low];
                    index = low;
                }

                break;
            }

            // Left half is sorted
            if (arr[low] <= arr[mid]) {

                if (arr[low] < ans) {
                    ans = arr[low];
                    index = low;
                }

                low = mid + 1;
            }

            // Right half is sorted
            else {

                if (arr[mid] < ans) {
                    ans = arr[mid];
                    index = mid;
                }

                high = mid - 1;
            }
        }

        return index;
    }
}