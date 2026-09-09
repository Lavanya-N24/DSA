import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {

        // Get the length of the array
        int n = nums.length;

        // If the array is empty, no sequence exists
        if (n == 0) {
            return 0;
        }

        // Variable to store the longest sequence length found
        int longest = 1;

        // HashSet to store unique elements for O(1) lookup
        Set<Integer> st = new HashSet<>();

        // Add all elements to the set
        for (int i = 0; i < n; i++) {
            st.add(nums[i]);
        }

        // Loop through each element in the set
        for (int it : st) {

            // If there is no number before 'it',
            // then 'it' is the starting point
            if (!st.contains(it - 1)) {

                // Start the count for this sequence
                int cnt = 1;

                // Store the current number
                int x = it;

                // Keep checking for the next consecutive number
                while (st.contains(x + 1)) {

                    // Move to the next number
                    x = x + 1;

                    // Increase the sequence length
                    cnt = cnt + 1;
                }

                // Update the longest sequence length
                longest = Math.max(longest, cnt);
            }
        }

        // Return the answer
        return longest;
    }
}