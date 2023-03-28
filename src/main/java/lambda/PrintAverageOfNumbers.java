package main.java.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintAverageOfNumbers {
    public static void main(String [] args){
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);
        double average = integers.stream().collect(Collectors.averagingInt(Integer::intValue));
        double average2 = integers.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println(average);
        System.out.println(average2);
        System.out.println(integers.stream().mapToInt(num -> num*num).filter(sqr -> sqr>25).count());
    }
}
