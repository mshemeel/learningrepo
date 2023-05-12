package main.java.probs;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

   Example 1:
 * Input: s = "egg", t = "add"
 * Output: true
 * Example 2:

 * Input: s = "foo", t = "bar"
 * Output: false

 *  String s = "badc";
 *  String t = "baba";
 *  Output = false
 */
public class IsomorphicString {
    public static void main(String[] args) {
        String s = "badc";
        String t = "baba";
        boolean isIsomorphic = true;
        Map<Character, Character> forewardMap = new HashMap<>();
        Map<Character, Character> reverseMap = new HashMap<>();
        if (s.length() != t.length()) {
            //edge case
            isIsomorphic = false;
        } else {
            for (int i = 0; i < s.length(); i++) {
                Character c1 = s.charAt(i);
                Character c2 = t.charAt(i);
                //map first string characters to second
                if (!forewardMap.containsKey(c1)) {
                    forewardMap.put(c1, c2);
                } else {
                    if (forewardMap.get(c1) != c2) {
                        isIsomorphic = false;
                    }
                }
                //map second string characters to first
                if (!reverseMap.containsKey(c2)) {
                    reverseMap.put(c2, c1);
                } else {
                    if (reverseMap.get(c2) != c1) {
                        isIsomorphic = false;
                        break;
                    }

                }
            }
        }
        System.out.println(isIsomorphic);

        System.out.println(verifyString(s,t) && verifyString(t,s)); //O(n + n)
    }

    private static boolean verifyString(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        boolean isIsomorphic = true;
        for (int i = 0; i < s.length(); i++) {
            Character c1 = s.charAt(i);
            Character c2 = t.charAt(i);
            //map first string characters to second
            if (!map.containsKey(c1)) {
                map.put(c1, c2);
            } else {
                if (map.get(c1) != c2) {
                    isIsomorphic = false;
                }
            }
        }
        return isIsomorphic;
    }
}
