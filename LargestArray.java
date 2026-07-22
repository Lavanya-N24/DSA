public class LargestArray {
    public static int findLargest(int[] arr) {
       
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 8};
        int largest = findLargest(array);
        System.out.println("The largest element in the array is: " + largest);
    }
    
}
