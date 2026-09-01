class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        HashSet<List<Integer>>result=new HashSet<>();
        if(nums==null || nums.length<4){
            return new ArrayList<>();

        }
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int k=j+1;
                int l=nums.length-1;
                while(k<l){
                  long sum = (long) nums[i] + (long) nums[j] + (long) nums[k] + (long) nums[l];
                    if (sum == (long) target) {
                        result.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        k++;
                        l--;
                    }
                    else if(sum<target){
                        k++;
                    }
                    else{
                        l--;
                    }
                }
              
            }
        }
        return new ArrayList<>(result);
    }
}