package main.java.probs;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateCharactersInString {
    public static void main(String[] args) {
        String str = "shemeelshez";

        Set<Character> uniqueCharSet = new HashSet<>();

        Set<Character> result = str.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> !uniqueCharSet.add(ch))
                .collect(Collectors.toSet());

        System.out.println(result);

        Set<Character> characters = new HashSet<>();
        Set<Character> resultSet = new HashSet<>();
        for(Character ch : str.toCharArray()){
            if(characters.contains(ch)){
                resultSet.add(ch);
            }else {
                characters.add(ch);
            }
        }

        System.out.println(resultSet);
    }
}
