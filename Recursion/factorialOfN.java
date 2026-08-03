package Recursion;

public class factorialOfN {
    public static int factorial(int n) {
        if (n < 0) {
            System.out.println("Input should be a positive integer.");
            return -1;
        }
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
    
}
