
    class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1;
        for(int i=1;i<nums.length;i++){
              if(nums[i]!=nums[i-1]){
                 nums[j]=nums[i]; 
                j++;
               
            }
           
        }
        if(nums.length==0){
            return 0;
        }
    
         return j;
    
}
}
public class removeDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1,1,2};
        int k = s.removeDuplicates(nums);
        System.out.println(k);
        for(int i=0;i<k;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
