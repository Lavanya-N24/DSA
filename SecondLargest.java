public class SecondLargest {
    public static int findSecondlargest(int[] arr){
        if(arr.length<2){
            return  -1;
        }
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
               
            }
        
        else if(arr[i]>secondlargest&&arr[i]!=largest){
            secondlargest=arr[i];
            }

        }
             if(secondlargest==Integer.MIN_VALUE){
            return  -1;
        
        }
        return secondlargest;
    }
        
    
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 8};
        int secondlargest = findSecondlargest(array);
        if(secondlargest==-1){
            System.out.println("There is no second largest element in the array.");
        }
        else{
            System.out.println("The second largest element in the array is: " + secondlargest);
        }
    }
}

