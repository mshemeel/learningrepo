package main.java.datastructure;

import java.util.Arrays;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        System.out.println(searchInsert(nums, target));
        //implementing binary search
        /*
         find middle, if > middle -> redo same for right side of the array
         */
        int len = nums.length;
        int start = 0;
        int end = len - 1;
        System.out.println(binarySearch(nums, target,start,end));
    }

    public static int searchInsert(int[] nums, int target) {
        int n = Arrays.binarySearch(nums, target);
        return Math.abs(n + 1);
    }

    public static int binarySearch(int[] nums, int target, int start, int end) {
        if (start > end) return start;
        int mid = (start + end) / 2;
        if (target == nums[mid])
            return mid+1;
        if (target < nums[mid])
            return binarySearch(nums, target, start, mid - 1);
        if (target > nums[mid])
            return binarySearch(nums, target, mid + 1, end);
        return -1;
    }
}