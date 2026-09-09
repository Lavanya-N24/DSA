package Recursion;

public class PalindromeRecursion {
   

    public boolean palindrome(String s, int left, int right) {

        // Base case
        if (left >= right) {
            return true;
        }

        // Characters don't match
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }

        // Recursive call
        return palindrome(s, left + 1, right - 1);
    }

    public static void main(String[] args) {

        PalindromeRecursion obj = new PalindromeRecursion();

        String s = "madam";

        System.out.println(obj.palindrome(s, 0, s.length() - 1));
    }
}

