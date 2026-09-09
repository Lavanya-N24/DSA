package Hashing;
import java.util.HashMap;
import java.util.Map;
public class ex2 {
   

//print 1,2,3,1,2 by using hash function


    public static void main(String[] args) {

       int[] arr = {1, 2, 3, 1, 2};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
    
