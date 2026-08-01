
    class Solution7 {
    public boolean isPrime(int n) {
          //your code goes here
          int count=0;
          for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
          }
          if(count==2){
            return true;
          }
          else{
            return false;
          }
    }
}
public class checkPrimeNumber {
    public static void main(String[] args) {
        int n = 29;
        Solution7 solution = new Solution7();
        boolean isPrime = solution.isPrime(n);
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
