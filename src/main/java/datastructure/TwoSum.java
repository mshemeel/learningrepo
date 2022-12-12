package main.java.datastructure;

import java.util.HashMap;
import java.util.Map;

/**
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 */
public class TwoSum {
    public static void main(String[] ar) {

        int [] nums = {2,7,11,15};
        int[] cc = twoSum(nums,9);
        System.out.println(cc);

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int reqNum = target - nums[i];
            if (map.containsKey(reqNum)) {
                return new int[]{i, map.get(reqNum)};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
