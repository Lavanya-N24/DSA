
    class Solution5 {
        public int[] divisors(int n) {
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }

            int[] arr = new int[count];
            int index = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    arr[index++] = i;
                }
            }

            return arr;
        }
    }
    public class divisorOfNumber {
        public static void main(String[] args) {
            int n = 36;
            Solution5 solution = new Solution5();
            int[] divisors = solution.divisors(n);

            System.out.print("Divisors of " + n + ": ");
            for (int divisor : divisors) {
                System.out.print(divisor + " ");
            }
            System.out.println();
            System.out.println("Number of divisors of " + n + " is: " + divisors.length);
        }
    }

