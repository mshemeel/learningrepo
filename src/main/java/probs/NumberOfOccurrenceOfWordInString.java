package main.java.probs;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberOfOccurrenceOfWordInString {
    public static void main(String[] args) {
        String str = "This this is is done by Shemeel Shemeel";
        Map<String, Long> result = Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);
    }
}
