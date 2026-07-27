

// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
import java.util.Scanner;
public class patternFifteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
    
       for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            System.out.print((char)('A'+j-1)+" ");
           
        }
        
          System.out.println();      
        
        }
       
        sc.close();
       }
    }
