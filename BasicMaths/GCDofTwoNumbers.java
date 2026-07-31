package BasicMaths;
class Solution {
    public int GCD(int n1, int n2) {
int gcd=1;
for(int i=1;i<Math.min(n1,n2);i++){
    if(n1%i==0 && n2%i==0){
        gcd=i;
    }
}
return gcd;
    }
}
public class GCDofTwoNumbers {
    public static void main(String[] args) {
        Solution s = new Solution();
        int n1 = 12;
        int n2 = 18;
        int gcd = s.GCD(n1, n2);
        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
    }
}