package main.java.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintSumOfAllNumbers {
    public static void main(String [] args){
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);
        int sum = integers.stream().mapToInt(Integer::intValue).sum();
        int sum2 = integers.stream().collect(Collectors.summingInt(Integer::intValue));
        int sum3 = integers.stream().reduce((a,b)->a+b).get();
        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}
