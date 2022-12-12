package main.java.datastructure;

import java.util.Arrays;

/**
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 */
public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {8,3,4,6,9};
        Arrays.stream(plusOne(digits)).forEach(System.out::println);
    }

    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }

        }
        if (digits[0] == 0) {
            int[] newNumber = new int[len + 1];
            newNumber[0] = 1;
            return newNumber;
        }
        return digits;
    }
}
