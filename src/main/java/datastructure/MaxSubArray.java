package main.java.datastructure;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number)
 * which has the largest sum and return its sum.
 *
 * A subarray is a contiguous part of an array.
 *
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 */
public class MaxSubArray {
    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSoFar = array[0]; //max till the end
        int maxEndingHere = array[0]; //max at current index
        for (int i = 1; i < array.length; i++) {
            maxEndingHere = Math.max(maxEndingHere+array[i],array[i]);
            maxSoFar = Math.max(maxEndingHere,maxSoFar);
        }
        System.out.println(maxSoFar);

    }
}
