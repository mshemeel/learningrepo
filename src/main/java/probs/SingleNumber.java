package main.java.probs;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * Example 1:
 * Input: nums = [2,2,1]
 * Output: 1
 * Example 2:
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 */
public class SingleNumber {
    public static void main(String[] args) {
        int [] nums = {4,1,2,1,2};
        Map<Integer, Long> collect = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));
        AtomicReference<Integer> singleNumber = new AtomicReference<>(0);
        collect.forEach((key,value) -> {
            if(value == 1){
                singleNumber.set(key);
            }
        });
        System.out.println(singleNumber.get());

    }
}
