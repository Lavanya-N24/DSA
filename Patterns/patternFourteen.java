package Patterns;

// A 
// A B 
// A B C 
// A B C D 
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