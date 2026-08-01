
    class Solution1 {
    public int[] plusOne(int[] digits) {

     
        for (int i = digits.length - 1; i >= 0; i--) {

           
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

     
        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }
}

public class plusOne {
    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        Solution1 solution = new Solution1();
        int[] result = solution.plusOne(digits);

        System.out.print("Result after adding one: ");
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }

}
