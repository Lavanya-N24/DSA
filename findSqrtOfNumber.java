public class findSqrtOfNumber {
    public int mySqrt(int x) {
        // Handle edge cases for 0 and 1
        if (x == 0 || x == 1) {
            return x;
        }

        long low = 1;
        long high = x;
        long ans = 1;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            // Use long to prevent integer overflow when squaring mid
            if (mid * mid <= x) {
                ans = mid; // Store potential answer
                low = mid + 1; // Look for a larger valid integer
            } else {
                high = mid - 1; // Number is too large, look smaller
            }
        }

        return (int) ans;
    }
    public static void main(String[] args) {
        findSqrtOfNumber sqrtFinder = new findSqrtOfNumber();
        int number = 8;
        int result = sqrtFinder.mySqrt(number);
        System.out.println("The integer square root of " + number + " is: " + result);
    }
} 
    

