package Recursion;

public class FibonacciRecursion {
    public static int fibonacci(int n) {
        if (n <= 1) {
            System.out.println("Input should be a positive integer.");
            return n;
        }
       //recursive call to calculate the Fibonacci number
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 6;
       for(int i=0;i<n;i++){
        System.out.print("Fibonacci(" + i + ") = " + fibonacci(i) + " ");
       }
    }
}
