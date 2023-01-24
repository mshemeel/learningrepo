package main.java.datastructure;

import java.util.Arrays;

public class SegregateZeroOne {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 0, 1, 0};
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        Arrays.stream(arr).forEach(System.out::println);
    }
}
