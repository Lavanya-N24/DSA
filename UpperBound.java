public class UpperBound {
    public int upperBound(int[] nums, int x) {
        int n=nums.length;
       int low=0;
       int high=nums.length-1;
       int ans=n;
       while(low<=high){
        int mid=(low+high)/2;
        if(nums[mid]>x){
             ans=mid;
             high=mid-1;

        }
        else{
            low=mid+1;
        }
       }
       return ans;
     }
     public static void main(String[] args) {
        UpperBound s = new UpperBound();
        int[] nums = {1, 2, 4, 4, 5, 6};
        int x = 4;
        int result = s.upperBound(nums, x);
        System.out.println("Upper bound index of " + x + " is: " + result);
     }
    }

    

