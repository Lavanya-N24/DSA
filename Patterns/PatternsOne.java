<<<<<<< HEAD:PatternsOne.java

=======
package Patterns;


//  *  *  *  * 
//  *  *  *  * 
//  *  *  *  * 
//  *  *  *  * 
>>>>>>> b525e7e96e8829a5fe1aa694be63337034306d43:Patterns/PatternsOne.java
//Pattern 1-4*4 star pattern
import java.util.Scanner;
public class PatternsOne {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows and columns");
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
              
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
    }
}
