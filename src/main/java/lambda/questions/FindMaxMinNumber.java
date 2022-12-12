package main.java.lambda.questions;

import java.util.Arrays;
import java.util.List;

public class FindMaxMinNumber {
    public static void main(String [] args){
        List<Integer> integers = Arrays.asList(100,243,100,444,454,243,471,444,295,3310,476,1412,213);
        int maxValue = integers.stream().mapToInt(Integer::intValue).max().getAsInt();
        int minValue = integers.stream().mapToInt(Integer::intValue).min().getAsInt();
        System.out.println(maxValue);
        System.out.println(minValue);
    }
}
