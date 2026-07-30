package BasicMaths;

public class countAllNumber {
    public static void main(String[] args) {
        int n = 123456789;
        int count = 0;

        while (n > 0) {
            int lastDigit = n % 10; // Get the last digit
            n =n/10; // Remove the last digit
            count++; // Increment the count
        }

        System.out.println("The number of digits in the given number is: " + count);
    }
    
}
