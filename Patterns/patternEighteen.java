package Patterns;
// E 
// D E 
// C D E 
// B C D E 
// A B C D E 

import java.util.Scanner;
public class patternEighteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
    
       for(int i=0;i<n;i++){
        for(char ch=(char)('E'-i);ch<='E';ch++){
            System.out.print(ch+" ");
        }
        System.out.println(); 
    }
        sc.close();
       
    }
}






