package main.java.datastructure;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] nums2 = {3, 4, 5, 6, 7, 8, 9};
        int k = 3;
        //rotate(nums, k);
        //Arrays.stream(nums).forEach(System.out::println);
        int len = nums2.length;
        k = k % len;
        reverse(nums2, 0, len - 1);
        reverse(nums2, 0, k - 1);
        reverse(nums2, k, len - 1);
        Arrays.stream(nums2).forEach(System.out::println);
    }

    public static void rotate(int[] nums, int k) {
        while (k > 0) {
            int len = nums.length;
            int last = nums[len - 1];
            for (int i = len - 1; i >= 0; i--) {
                if (i == 0) {
                    nums[i] = last;
                } else {
                    nums[i] = nums[i - 1];
                }
            }
            k--;
        }
    }

    public static void reverse(int[] nums, int start, int end) {
        int temp = 0;
        while (start < end) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
