class Solution {

    private boolean canMakeBouquets(int[] bloomDay, int m, int k, int day) {
        int count = 0;
        int bouquets = 0;

        for (int bloom : bloomDay) {
            if (bloom <= day) {
                count++;
                if (count == k) {
                    bouquets++;
                    count = 0; // Reset consecutive count for the next bouquet
                }
            } else {
                count = 0; // Reset if flower hasn't bloomed yet
            }
        }

        return bouquets >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;

        // Overflow check: If total flowers needed exceeds array length, it's impossible
        if ((long) m * k > n) {
            return -1;
        }

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int day : bloomDay) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }

        int ans = -1;

        // Binary Search on the range [min_day, max_day]
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canMakeBouquets(bloomDay, m, k, mid)) {
                ans = mid;
                high = mid - 1; // Try to find a smaller day
            } else {
                low = mid + 1;  // Need more days
            }
        }

        return ans;
    }
}