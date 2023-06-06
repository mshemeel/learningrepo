package main.java.probs;

import java.util.HashSet;
import java.util.Set;

/**
 * String str1 = "abcde";
 * String str2 = "abxyz";
 *
 * output : cdexyz
 *
 */
public class FindStringWithNonDuplicateChar {
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "abxyz";

        Set<Character> charSet = new HashSet<>();
        findNonDuplicateCharacterSet(str1,charSet);
        findNonDuplicateCharacterSet(str2,charSet);

        charSet.forEach(System.out::print);
        System.out.println();
        StringBuilder resultString = new StringBuilder();
        charSet.forEach(resultString::append);
        System.out.println(resultString);


    }

    private static void findNonDuplicateCharacterSet(String str, Set<Character> charSet) {
        str.chars()
                .mapToObj(obj -> (char) obj)
                .forEach(character -> {
                    if(!charSet.contains(character)){
                        charSet.add(character);
                    }else{
                        charSet.remove(character);
                    }
                });
    }
}
