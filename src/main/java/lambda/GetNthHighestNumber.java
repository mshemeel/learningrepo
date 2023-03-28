package main.java.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class GetNthHighestNumber {
    public static void main(String [] args){
        int N = 2;//N>0
        List<Integer> integers = Arrays.asList(100,243,100,444,454,243,471,444,295,3310,476,1412,213);
        integers.stream().sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);
        int number = integers.stream().sorted(Comparator.reverseOrder()).skip(N-1).findFirst().get();
        System.out.println("Nth largest number :-" + number);
        int smallest = integers.stream().sorted().skip(N-1).findFirst().get();
        System.out.println("Nth smallest number :-"+smallest);

    }
}
