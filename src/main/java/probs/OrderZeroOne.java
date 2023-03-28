package main.java.probs;

import java.util.Arrays;

public class OrderZeroOne {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0};
        int len = arr.length;
        System.out.println(len);
        int j = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] == 0) {
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println();
        System.out.println(arr.length);

    }
}
