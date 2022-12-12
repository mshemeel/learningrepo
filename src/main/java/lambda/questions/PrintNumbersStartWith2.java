package main.java.lambda.questions;

import java.util.Arrays;
import java.util.List;

public class PrintNumbersStartWith2 {
    public static void main(String[] args){
        List<Integer> integers = Arrays.asList(122,243,234,444,452,261,471,486,295,3310,2211,1412,213);
        long count = integers.stream()
                .map(integer -> String.valueOf(integer))
                .filter(element -> element.startsWith("2"))
                .count();
        System.out.println(count);
    }
}
