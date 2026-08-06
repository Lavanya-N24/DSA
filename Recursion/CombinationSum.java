package Recursion;


    import java.util.ArrayList;

public class CombinationSum { 

    static void Combination(int[] arr, int target, int index, ArrayList<Integer> list) {

        if (target == 0) {
            System.out.println(list);
            return;
        }

        if (index == arr.length) {
            return;
        }

        // Take the current number
        if (arr[index] <= target) {
            list.add(arr[index]);
            Combination(arr, target - arr[index], index, list);
            list.remove(list.size() - 1);
        }

        // Skip the current number
        Combination(arr, target, index + 1, list);
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 5};
        int target = 8;

        Combination(arr, target, 0, new ArrayList<>());
    }
}

