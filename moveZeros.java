
    class Solution {
    public void moveZeroes(int[] nums) {
      int j=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            nums[j]=nums[i];
            j++;
        }
      } 
      while(j<nums.length){
        nums[j]=0;
        j++;
      }
      System.out.println(j);
    }
}
public class moveZeros {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[] nums = {0,1,0,3,12};
    s.moveZeroes(nums);
    for(int i=0;i<nums.length;i++){
      System.out.print(nums[i]+" ");
    }
  }
}
