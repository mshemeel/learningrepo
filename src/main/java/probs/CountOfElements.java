package main.java.probs;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOfElements {
    public static void main(String[] args) {
        int[] arr = {1, 1, 8, 4, 4, 2, 4};
        //output 1-2,8-1,4-3,2-1
        Map<Integer, Long> collect = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));

        System.out.println(collect);
    }


}
