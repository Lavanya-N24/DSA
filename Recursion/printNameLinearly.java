package Recursion;

public class printNameLinearly {
   
    public static void printNameHelper(String name, int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(i + " " + name);
        printNameHelper(name, i + 1, n);
    }

    public static void main(String[] args) {
        String name = "lavanya";
        int n = 5;
        
        printNameHelper(name, 1,n);
    }
}
