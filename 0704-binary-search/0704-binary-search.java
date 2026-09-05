class Solution {
    public int search(int[] nums, int target) {
        int n =nums.length;
        int low=0;
        int high=n-1;
        return binarySearch(nums,0,nums.length-1,target);
    }
    private int binarySearch(int[]nums,int low,int high,int target){
        if(low>high){
            return -1;
        }
        int  mid=(low+high)/2;
        while(low<=high){
         
            if(target==nums[mid]){
                return mid;
            }
            else if(target > nums[mid]){
                return binarySearch( nums, mid+1,high,target);
            }
            else{
                return binarySearch(nums,low,mid-1,target);
            }
        }  
        return -1  ;
}
}