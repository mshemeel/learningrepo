package main.java.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {
    public static void main(String [] args){
        List<Integer> integers = Arrays.asList(100,243,100,444,454,243,471,444,295,3310,476,1412,213);
        List<Integer> sortedInts = integers.stream().sorted().collect(Collectors.toList());
        List<Integer> sortedDescInts = integers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedInts);
        System.out.println(sortedDescInts);
    }
}
