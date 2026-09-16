class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int first = firstOccurrence(nums, n, target);
        
        // If the element is not found, return {-1, -1}
        if (first == -1) {
            return new int[]{-1, -1};
        }
        
        int last = lastOccurrence(nums, n, target);
        return new int[]{first, last};
    }
    
    // Function to find the first occurrence of target
    private int firstOccurrence(int[] arr, int n, int k) {
        int low = 0, high = n - 1;
        int first = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == k) {
                first = mid;
                high = mid - 1; // Continue searching in the left half
            } else if (arr[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return first;
    }
    
    // Function to find the last occurrence of target
    private int lastOccurrence(int[] arr, int n, int k) {
        int low = 0, high = n - 1;
        int last = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == k) {
                last = mid;
                low = mid + 1; // Continue searching in the right half
            } else if (arr[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return last;
    }
}