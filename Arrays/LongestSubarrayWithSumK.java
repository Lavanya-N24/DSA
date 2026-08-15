package Arrays;
class LongestSubarrayWithSumK {
    public int longestSubarray(int[] nums, int k) {
   int len=0;
       for(int i=0;i<nums.length;i++){
        int sum=0;
        for(int j=i;j<nums.length;j++){
            sum=sum+nums[j];
        
        if(sum==k){
             len=Math.max(len,j-i+1);

        }
       }
       }
       return len;
    }
    public static void main(String[] args) {
        LongestSubarrayWithSumK solution = new LongestSubarrayWithSumK();
        int[] nums = {1, 2, 3, 4, 5};
        int k = 9;
        int length = solution.longestSubarray(nums, k);
        System.out.println("The length of the longest subarray with sum " + k + " is: " + length);
    }
}