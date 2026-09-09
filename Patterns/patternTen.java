<<<<<<< HEAD:patternTen.java

=======
package Patterns;
>>>>>>> b525e7e96e8829a5fe1aa694be63337034306d43:Patterns/patternTen.java
// *
// **
// ***
// ****
// ***
// **
// *
 import java.util.Scanner;
public class patternTen {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
       int n = sc.nextInt();
      
       for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
