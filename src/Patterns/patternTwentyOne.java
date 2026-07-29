
    import java.util.Scanner;
public class patternTwentyOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
    
       for(int i=0;i<n;i++){
     for(int j=1;j<=n-i;j++){
        System.out.print("*");
     }
     for(int j=1;j<2*i;j++){
        System.out.print(" ");
     }
      for(int j=1;j<=n-i;j++){
        System.out.print("*");
     }
      System.out.println();
       }
    for(int i=0;i<=n;i++){
        for(int j=0;j<=i;j++){
        System.out.print("*");
     }
      for(int j=0;j<=2-(2*i);j++){
        System.out.print(" ");
     }
        for(int j=0;j<=i;j++){
        System.out.print("*");
     }
        System.out.println();
       }

      sc.close();
        }
        
         
    }


