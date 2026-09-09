<<<<<<< HEAD:patternsFive.java



=======
package Patterns;
//  1 
//  2  2 
//  3  3  3 
//  4  4  4  4 
>>>>>>> b525e7e96e8829a5fe1aa694be63337034306d43:Patterns/patternsFive.java
import java.util.Scanner;
public class patternsFive {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
       int n = sc.nextInt();
      
       for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+i+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}










 
