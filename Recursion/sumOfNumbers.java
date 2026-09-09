package Recursion;

public class sumOfNumbers {
   
    public static void sumOfNumbers(int i,int sum) {
        if (i<1) {
            System.out.println("Sum of first " + 5 + " numbers is: " + sum);
            return ;
        }
       
        sumOfNumbers(i-1,sum+i);
    }
    public static void main(String[] args) {
      
        sumOfNumbers(5,0);
    }
}

