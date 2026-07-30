package src.BasicMaths;

public class reverseNumber {
    public static void main(String[] args) {
        int n = 123456789;
        int reversedNumber = 0;

        while (n > 0) {
            int lastDigit = n % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + lastDigit; // Append the last digit to the reversed number
            n = n / 10; // Remove the last digit
        }

        System.out.println("The reversed number is: " + reversedNumber);
    }
}
