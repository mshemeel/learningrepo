package main.java.algorithms.sorting.merge;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] input = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        Arrays.stream(mergeSort(input, input.length)).forEach(System.out::println);
    }

    private static int[] mergeSort(int[] input, int len) {
        if (len == 1) {
            return input;
        }
        int mid = len / 2;
        int leftLen = mid;
        int rightLen = len - mid;
        int[] left = new int[leftLen];
        int[] right = new int[rightLen];
        for (int i = 0; i < mid; i++) {
            left[i] = input[i];
        }
        for (int j = mid; j < len; j++) {
            right[j - mid] = input[j];
        }

        //Split into small pieces
        mergeSort(left, leftLen);
        mergeSort(right, rightLen);

        //merge
        merge(input, left, right, leftLen, rightLen);

        return input;
    }

    private static int[] merge(int[] result, int[] left, int[] right, int leftLen, int rightLen) {
        int i = 0, j = 0, k = 0;
        while (i < leftLen && j < rightLen) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        while (i < leftLen) {
            result[k++] = left[i++];
        }
        while (j < rightLen) {
            result[k++] = right[j++];
        }
        return result;
    }
}
