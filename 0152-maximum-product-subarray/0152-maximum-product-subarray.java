class Solution {
    public int maxProduct(int[] nums) {
        double maxProd=Integer.MIN_VALUE;
        double pre=1;
        double suf=1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(pre==0){
                pre=1;
            }
            if(suf==0){
                suf=1;
            }
            pre=pre*(double)nums[i];
            suf=suf*(double)nums[n-i-1];
            maxProd=Math.max(maxProd,Math.max(pre,suf));
        }
        return (int)maxProd;
    }
}