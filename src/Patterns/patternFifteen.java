// A B C D 
// A B C 
// A B 
// A 

import java.util.Scanner;
public class patternFifteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
    
       for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
            System.out.print((char)('A'+j-1)+" ");
           
        }
        
          System.out.println();      
        
        }
       
        sc.close();
       }
    }
