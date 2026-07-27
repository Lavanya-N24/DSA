
// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
import java.util.Scanner;
public class patternFourteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int num=1;
       for(int i=0;i<n;i++){
        for(char ch='A';ch<='A'+i;ch++){
            System.out.print(ch+" ");
        }
          System.out.println();      
        
        }
       
        sc.close();
       }
    }