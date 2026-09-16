class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        
        while (low <= high) {
            int mid =(low + high) / 2;
            
            // If target is found
            if (nums[mid] == target) {
                return true;
            }
            
            // Edge case: when duplicates make it impossible to identify the sorted half
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
                continue;
            }
            
            // Check if the left half is sorted
            if (nums[low] <= nums[mid]) {
                // Check if the target lies within the left sorted half
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } 
            // Otherwise, the right half must be sorted
            else {
                // Check if the target lies within the right sorted half
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        
        return false;
    }
}