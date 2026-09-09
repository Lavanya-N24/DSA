<<<<<<< HEAD:patternEleven.java

=======
package Patterns;
>>>>>>> b525e7e96e8829a5fe1aa694be63337034306d43:Patterns/patternEleven.java

// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1 
import java.util.Scanner;
public class patternEleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
       for(int i=1;i<=n;i++){
         int value;
            if(i%2==1){
                value=1;

            }
            else{
                value=0;
            }
                for(int j=1;j<=i;j++){
                  
                    System.out.print(value + " ");
                      value=1-value;
                    
                    
                }
          System.out.println();      
        
        }
       
        sc.close();
       }
    }