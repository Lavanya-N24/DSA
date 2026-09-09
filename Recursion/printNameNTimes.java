package Recursion;

public class printNameNTimes {
    public static void printName(String name, int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(name);
        printName(name, n - 1);
    }

    public static void main(String[] args) {
        String name = "lavanya";
        int n = 5;
        
    printName(name, n);
    }
}



    

