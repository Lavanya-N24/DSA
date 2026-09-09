public class BinarySearchforFloor {
    public int floor(int[] nums, int x) {
        int n=nums.length;
       int low=0;
       int high=nums.length-1;
       int ans=-1;
       while(low<=high){
        int mid=(low+high)/2;
        if(nums[mid]<=x){
             ans=mid;
             low=mid+1;

        }
        else{
            high=mid-1;
        }
       }
       return ans;
     }
     public static void main(String[] args) {
        BinarySearchforFloor s = new BinarySearchforFloor();
        int[] nums = {1, 2, 4, 4, 5, 6};
        int x = 4;
        int result = s.floor(nums, x);
        System.out.println("Floor index of " + x + " is: " + result);
     }
}
