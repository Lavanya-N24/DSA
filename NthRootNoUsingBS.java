public class NthRootNoUsingBS {
    
    // Helper function to multiply 'number' n times
    private double multiply(double number, int n) {
        double ans = 1.0;
        for(int i = 1; i <= n; i++) {
            ans = ans * number;
        }
        return ans;
    }

    public double getNthRoot(int n, int m) {
        double low = 1.0;
        double high = (double) m;
        double eps = 1e-6; // Precision tolerance

        // Binary search for the decimal root
        while((high - low) > eps) {
            double mid = (low + high) / 2.0;
            
            if(multiply(mid, n) < m) {
                low = mid; // Answer is greater than mid
            } else {
                high = mid; // Answer is smaller than mid
            }
        }
        
        // At the end of the loop, low and high are almost equal
        return low; 
    }
    public static void main(String[] args) {
        NthRootNoUsingBS rootFinder = new NthRootNoUsingBS();
        int n = 3; // Example: Find the cube root
        int m = 27; // Example: The number to find the root of
        double result = rootFinder.getNthRoot(n, m);
        System.out.printf("The %d-th root of %d is approximately: %.6f%n", n, m, result);
    }

}
