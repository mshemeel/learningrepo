package main.java.learn;

import java.util.HashMap;

/**
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 */
public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCVI";

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int len = s.length();
        int result = map.get(s.charAt(len - 1));

        for (int i = len - 2; i >= 0; i--) {
            int secondLastChar = map.get(s.charAt(i));
            int lastChar = map.get(s.charAt(i + 1));
            if (secondLastChar >= lastChar)
                result += map.get(s.charAt(i));
            else
                result -= map.get(s.charAt(i));
        }
        System.out.println(result);
    }
}
