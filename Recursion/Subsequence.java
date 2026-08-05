package Recursion;
 import java.util.ArrayList;
public class Subsequence {
   
    public static void printSubsequence(int index, int[] arr, ArrayList<Integer> list) {

        if (index == arr.length) {

            if (list.size() == 0)
                System.out.println("{}");
            else
                System.out.println(list);

            return;
        }

        // Take
        list.add(arr[index]);
        printSubsequence(index + 1, arr, list);

        // Don't Take
        list.remove(list.size() - 1);
        printSubsequence(index + 1, arr, list);
    }

    public static void main(String[] args) {

        int[] arr = {3,1,2};
        ArrayList<Integer> list = new ArrayList<>();

        printSubsequence(0, arr, list);
    }
}

