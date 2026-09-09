<<<<<<< HEAD:patternSeventeen.java



=======
package Patterns;


>>>>>>> b525e7e96e8829a5fe1aa694be63337034306d43:Patterns/patternSeventeen.java
//     A
//    ABA
//   ABCBA
//  ABCDCBA
// ABCDEDCBA
import java.util.Scanner;
public class patternSeventeen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
    
       for(int i=0;i<n;i++){
        for(int j=1;j<=n-i-1;j++){
            System.out.print(" ");
           
        }
        char ch=(char)('A');
        int breakpoint=i;
         for(int j=1;j<=2*i+1;j++){
            System.out.print(ch);
            if(j<=breakpoint){
                ch++;
            }
            else{
                ch--;
            }
           
        }
        for(int j=1;j<=n-i-1;j++){
 System.out.print(" ");
           
        
               
        
        }
        System.out.println(); 
    }
        sc.close();
       
    }
}




