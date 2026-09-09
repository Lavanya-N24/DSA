<<<<<<< HEAD:patternsFour.java

=======
package Patterns;
>>>>>>> b525e7e96e8829a5fe1aa694be63337034306d43:Patterns/patternsFour.java
//patterns 4
//* * * * * 
//* * * * 
//* * *
//* *
//*
import java.util.Scanner;
public class patternsFour {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
       int n = sc.nextInt();
      
       for(int i=0;i<=n;i++){
            for(int j=0;j<n-i+1;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
    }
}
