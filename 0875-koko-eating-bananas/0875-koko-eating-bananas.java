class Solution {
    private long calculateTotalHours(int[] piles, int hourlyRate) {
        long totalHours = 0;
        for (int pile : piles) {
            // Equivalent to Math.ceil((double) pile / hourlyRate) using integer arithmetic
            totalHours += (pile + hourlyRate - 1L) / hourlyRate;
        }
        return totalHours;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        
        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long totalHours = calculateTotalHours(piles, mid);

            if (totalHours <= h) {
                ans = mid;
                high = mid - 1; // Try finding a smaller eating speed
            } else {
                low = mid + 1;  // Speed is too slow, increase speed
            }
        }

        return ans;
    }
}