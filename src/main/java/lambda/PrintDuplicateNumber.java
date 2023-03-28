package main.java.lambda;

import java.util.*;
import java.util.stream.Collectors;

public class PrintDuplicateNumber {
    public static void main(String [] args){
        List<Integer> integers = Arrays.asList(100,243,100,444,454,243,471,444,295,3310,476,1412,213);
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicateNumbers = integers.stream().filter(num -> !set.add(num)).collect(Collectors.toSet());
        Set<Integer> dupNumbers = integers.stream().filter(num -> Collections.frequency(integers,num)>1).collect(Collectors.toSet());
        System.out.println(duplicateNumbers);
        System.out.println(dupNumbers);
        System.out.println(set);

        System.out.println(Collections.frequency(integers,100));
    }
}
