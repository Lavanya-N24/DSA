public class floorAndCeil {
    public int[] getFloorAndCeil(int[] nums, int x) {
     int floor=findFloor(nums,x);
     int ceil=findCeil(nums,x);
     return new int[]{floor,ceil};
    }
    private int findFloor(int[] nums,int x){
       int low=0;
       int high=nums.length-1;
    int ans=-1;
       while(low<=high){
        int mid=(low+high)/2;
        if(nums[mid]<=x){
         ans=nums[mid];
            low=mid+1;

        }
        else{
            high=mid-1;
        }
       }
       return ans;
    }
     private int findCeil(int[] nums,int x){
       int low=0;
       int high=nums.length-1;
    int ans=-1;
       while(low<=high){
        int mid=(low+high)/2;
        if(nums[mid]>=x){
        ans=nums[mid];
            high=mid-1;

        }
        else{
            low=mid+1;
        }
       }
     return ans;
    }
    public static void main(String[] args) {
        floorAndCeil s = new floorAndCeil();
        int[] nums = {1, 2, 4, 5, 6};
        int x = 4;
        int[] result = s.getFloorAndCeil(nums, x);
        System.out.println("Floor of " + x + " is: " + result[0]);
        System.out.println("Ceil of " + x + " is: " + result[1]);
     }
}
 