class Solution {
    public int singleNumber(int[] nums) {
       
        for(int i=0;i<nums.length;i++){
             int count=0;
            int arr=nums[i];
           
            for(int j=0;j<nums.length;j++){
                if(nums[j]==arr){
                    count++;
                }
            }
                   
        if(count<=1){
            return nums[i];
        }
        }
        
    return -1;
}
}