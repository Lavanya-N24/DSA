package Arrays;
import java.util.HashMap;
public class LongestSAOptimalWay {
    public int longestSubarray(int[] nums, int k) {
        int sum = 0;
        int maxLength = 0;
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
      // Handle the case when the subarray starts from index 0

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if(sum==k){
                maxLength=i+1;
            }
            if (prefixSumMap.containsKey(sum - k)) {
                int length = i - prefixSumMap.get(sum - k);
                maxLength = Math.max(maxLength, length);
            }

            // Store the first occurrence of the prefix sum
            if (!prefixSumMap.containsKey(sum)) {
                prefixSumMap.put(sum, i);
            }
        }

        return maxLength;
    }
    public static void main(String[] args) {
        LongestSAOptimalWay solution = new LongestSAOptimalWay();
        int[] nums = {1, 2, 3, 4, 5};
        int k = 9;
        int length = solution.longestSubarray(nums, k);
        System.out.println("The length of the longest subarray with sum " + k + " is: " + length);
    }
}
