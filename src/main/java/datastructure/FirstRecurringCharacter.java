package main.java.datastructure;

import java.util.HashSet;
import java.util.Set;

/**
 * nums = {2,5,1,2,3,5,1,2,4}
 * ans = 2
 */
public class FirstRecurringCharacter {

    public static void main(String [] args){
        int[] nums = {2,5,1,2,3,5,1,2,4};
        int[] nums2 = {2,3,4,5};
        System.out.println(firstRecurringChar(nums));
        System.out.println(firstRecurringChar(nums2));
    }

    private static String firstRecurringChar(int[] nums) {
        Set<Integer> integerSet = new HashSet<>();
        for(int num : nums){
            if(!integerSet.contains(num)){
                integerSet.add(num);
            }else{
                return String.valueOf(num);
            }
        }
        return "undefined";
    }
}
