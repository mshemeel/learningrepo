package main.java.datastructure;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] array1 = {0, 3, 4, 31, 33, 34, 66};
        int[] array2 = {4, 6, 30, 31};
        int array1Len = array1.length;
        int array2Len = array2.length;
        //merge sorted array = {0,3,4,4,6,30,31}
        int firstArrPos = 0;
        int secondArrPos = 0;
        int mergedArrPos = 0;
        int[] mergedArray = new int[array1Len + array2Len];
        while (firstArrPos < array1Len && secondArrPos < array2Len) {
            if (array1[firstArrPos] < array2[secondArrPos]) {
                mergedArray[mergedArrPos++] = array1[firstArrPos++];
            } else {
                mergedArray[mergedArrPos++] = array2[secondArrPos++];
            }
        }
        while (firstArrPos < array1Len) {
            mergedArray[mergedArrPos++] = array1[firstArrPos++];
        }

        while (secondArrPos < array2Len) {
            mergedArray[mergedArrPos++] = array2[secondArrPos++];
        }
        Arrays.stream(mergedArray).forEach(System.out::println);
    }

}
