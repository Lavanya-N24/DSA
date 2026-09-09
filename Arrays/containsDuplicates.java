package Arrays;
import java.util.HashMap;


    class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }
}
public class containsDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 1}; // Example input array
        Solution solution = new Solution();
        boolean hasDuplicates = solution.containsDuplicate(nums);
        System.out.println("Contains duplicates: " + hasDuplicates);
    }
}
