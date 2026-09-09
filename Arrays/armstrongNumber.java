package Arrays;
    class Solution6 {
    public boolean isArmstrong(int n) {
        int temp=n;
int sum=0;
while(n>0){
int lastdigit=n%10;
sum=sum+(lastdigit*lastdigit*lastdigit);
n=n/10;
}
if(temp==sum){
    return true;
}
else{
    return false;
}

    }
}
public class armstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        Solution6 solution = new Solution6();
        boolean isArmstrong = solution.isArmstrong(n);
        if (isArmstrong) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
     
}
