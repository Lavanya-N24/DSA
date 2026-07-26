//second Patterns 
// 1
// 1 2
// 1 2 3
// 1 2 3 4
//Pattern 1-4*4 star pattern
import java.util.Scanner;

public class patternsThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number");
        int n = sc.nextInt();

        for(int i = 0; i <=n; i++){
            for(int j = 0; j <= i+1; j++){
                System.out.print( " " + j+ " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}


 

