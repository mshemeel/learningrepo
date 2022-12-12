package main.java.algorithms.sorting.selection;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] input = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        Arrays.stream(selectionSort(input)).forEach(System.out::println);
    }

    /*
    Select the smallest value, compare with each value, swap if the smallest is greater than current value
     */
    private static int[] selectionSort(int[] input) {
        int len = input.length;
        for (int i = 0; i < len; i++) {
            int minPos = i;
            int temp = input[i];
            for (int j = i + 1; j < len; j++) {
                if (input[minPos] > input[j]) {
                    minPos = j;
                }
            }
            input[i] = input[minPos];
            input[minPos] = temp;
        }
        return input;
    }
}
