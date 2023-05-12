package main.java.probs;

import java.util.Arrays;
import java.util.List;

public class LeastPositiveIntegerMissing {
    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 7, 8, 0, 2, 5, -6};
        int[] arr2 = {3, 7, -1, 8, 9, 10};
        //ans = 4
        int ans = leastPositiveMissingNumber(arr);
        System.out.println(ans == -1 ? "Nothing is Missing" : ans);

    }

    private static int leastPositiveMissingNumber(int[] arr) {
        int count = 1;
        int[] sortedArr = Arrays.stream(arr).sorted().toArray();
        for (int j : sortedArr) {
            if (j > 0) {
                if (count == j) {
                    count++;
                } else {
                    //missing number = count
                    return count;
                }
            }
        }
        return -1;
    }
}
