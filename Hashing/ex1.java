package Hashing;
//print "abcdabefc" by using hash function
  import java.util.HashMap;
import java.util.Map;
public class ex1 {
    
  


    public static void main(String[] args) {

        String s = "abcdabcfc";

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}