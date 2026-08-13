package Arrays;

public class MissingValue {
   
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int expected=(n*(n + 1))/2;
        int actual=0;
        for(int i=0;i<nums.length;i++){
            actual=actual+nums[i];

        }
        return expected-actual;
    }
    public static void main(String[] args) {
        MissingValue mv = new MissingValue();
        int[] nums = { 3, 0, 1 };
        int missing = mv.missingNumber(nums);
        System.out.println("The missing number is: " + missing);
    }
}

