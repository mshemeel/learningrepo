package main.java.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PrintVowelsInString {
    public static void main(String[] args) {
        String str = "ilovejavabyshemeel";

        Predicate<Character> predicate = p -> p == 'a' || p == 'e' || p == 'i' || p == 'o' || p == 'u';

        Map<Character, Long> result = str.toLowerCase()
                .chars()
                .mapToObj(s -> (char) s)
                .filter(predicate)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(result);
        System.out.println("+++++ Using method +++++");
        System.out.println(vowelsInString(str));
    }

    public static Map<Character, Integer> vowelsInString(String str) {
        Predicate<Character> predicate = p -> p == 'a' || p == 'e' || p == 'i' || p == 'o' || p == 'u';
        Map<Character, Integer> vowelsCountMap = new HashMap<>();
        for (Character ch : str.toCharArray()) {
            if (predicate.test(ch)) {
                if (!vowelsCountMap.containsKey(ch)) {
                    vowelsCountMap.put(ch, 1);
                } else {
                    int count = vowelsCountMap.get(ch);
                    count++;
                    vowelsCountMap.put(ch, count);
                }
            }
        }
        return vowelsCountMap;
    }
}
