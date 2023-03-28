package main.java.probs;

import java.util.Arrays;
import java.util.List;

/**
 * You have an array with N-1 integers. All of the integers in the array are different ( distinct ) and are between 1 and N.
 * Your task is to find the missing integer in the range of 1 to N.
 * <p>
 * Testcase – 1 :
 * Input :
 * n: 6
 * Array : 2 3 6 5 4
 * Output : 1
 * Explaination : 1 is missing from the array.
 * Testcase – 2 :
 * Input :
 * n: 9
 * Array : 5 7 8 4 6 1 3 9
 * Output : 2
 * Explaination : 2 is missing from the array.
 */
public class FindMissingNumberFromArray {
    public static void main(String[] args) {
        int n = 6;
        List<Integer> integers = Arrays.asList(2, 3, 6, 5, 4);
        for(int i = 1; i < n-1;i++){
            if(!integers.contains(i)){
                System.out.println(1);
                break;
            }
        }
    }
}
