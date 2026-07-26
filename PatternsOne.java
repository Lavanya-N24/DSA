//Pattern 1-4*4 star pattern
import java.util.Scanner;

public class PatternsOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows and columns");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}

