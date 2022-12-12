package main.java.algorithms.sorting.bubble;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] input = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        Arrays.stream(bubbleSort(input)).forEach(System.out::println);
    }

    /*
    Compare each elements, swap it
     */
    private static int[] bubbleSort(int[] input) {
        int len = input.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (input[i] > input[j]) {
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        return input;
    }
}
