//left rotate an array by one place
public class LeftRotate {
  
    public void rotateArrayByOne(int[] nums) {
        int temp=nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i-1]=nums[i];
        }
        nums[nums.length-1]=temp;
    }
public static void main(String[] args) {
        LeftRotate lr = new LeftRotate();
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Original array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        lr.rotateArrayByOne(array);
        System.out.println("\nArray after left rotation by one place: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

}

