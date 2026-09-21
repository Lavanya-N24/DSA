class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
       int high = Integer.MIN_VALUE;
        for (int num : nums) {
            high = Math.max(high, num);
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(calculatedSum(nums,mid)<=threshold){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;

    }
    private int calculatedSum(int[]nums,int divisor){
        int sum=0;
        for(int num : nums){
            sum=sum+(int)Math.ceil((double) num/(double)divisor);
        }
        return sum;
    }

}