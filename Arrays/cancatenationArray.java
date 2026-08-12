package Arrays;
    class Solution3 {
    public int[] getConcatenation(int[] nums) {
        int ans[]=new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
           
        }
       
         return ans;
    }
   
}
public class cancatenationArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Solution3 solution = new Solution3();
        int[] result = solution.getConcatenation(nums);

        System.out.print("Concatenated array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
