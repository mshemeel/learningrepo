package main.java.datastructure;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int [] nums = {0,1,0,3,12,4};
        moveZeroes(nums); //O(n) solution
        Arrays.stream(nums).forEach(System.out::println);
    }
    public static void moveZeroes(int[] nums) {
        int length = nums.length;
        int j = 0;
        for(int i =0 ; i< length ; i++){
            if(nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }
}
