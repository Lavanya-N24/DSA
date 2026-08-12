package Arrays;
public class reverseArray {
    public void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // Swap elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseArray ra = new reverseArray();
        ra.reverse(arr);
        System.out.println("Reversed array: " + java.util.Arrays.toString(arr));
    }
    }

