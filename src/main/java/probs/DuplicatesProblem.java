package main.java.probs;
/**
 * Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 * Example 2:
 *
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 */

import java.util.HashMap;

public class DuplicatesProblem {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1};
        int k = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            } else {
                int duplicatePos = map.get(nums[i]);
                if (Math.abs(i - duplicatePos) <= k) {
                    flag = true;
                    break;
                } else {
                    map.put(nums[i], i);
                }

            }
        }
        System.out.println(flag);
    }
}
