package main.java.algorithms.sorting.quick;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] input = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        quickSort(input, 0, input.length-1);
        Arrays.stream(input).forEach(System.out::println);
    }

    public static void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);
            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    private static int partition(int arr[], int begin, int end) {
        int pivot = arr[end];//pivot is last element
        int i = (begin - 1); // position

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }
}
