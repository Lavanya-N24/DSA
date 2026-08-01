package BasicMaths;

public class divisorNumber {
    public static void main(String[] args) {
        int n ;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
            int arr[] = new int[count];
int index=0;
        } for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr[index++] = i;
            }
        }
        System.out.println("Number of divisors of " + n + " is: " + count);
    }
    
}
