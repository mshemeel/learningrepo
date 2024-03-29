package main.java.probs;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class CheckIfStringAnagrams {
    public static void main(String[] args) {
        String s1 = "abbc";
        String s2 = "bbac";
        String s3 = "cbba";
        boolean isAnagram = checkAnagram(s1, s2, s3);
        System.out.println("IsAnagram ->" + isAnagram);

        System.out.println(checkAnagramUsingSet(s1, s2, s3));

    }

    private static boolean checkAnagram(String s1, String s2, String s3) {
        boolean isAnagram = false;
        if (s1.length() == s2.length() && s1.length() == s3.length()) {
            char[] s1Arr = s1.toLowerCase().toCharArray();
            char[] s2Arr = s2.toLowerCase().toCharArray();
            char[] s3Arr = s3.toLowerCase().toCharArray();

            Arrays.sort(s1Arr);
            Arrays.sort(s2Arr);
            Arrays.sort(s3Arr);

            if (Arrays.equals(s1Arr, s2Arr) && Arrays.equals(s2Arr, s3Arr)) {
                isAnagram = true;
            }

        }
        return isAnagram;
    }

    private static boolean checkAnagramUsingSet(String s1, String s2, String s3) {
        boolean isAnagram = false;
        if (s1.length() == s2.length() && s1.length() == s3.length()) {
            Set<Character> set1 = s1.toLowerCase().chars()
                    .mapToObj(obj -> (char) obj)
                    .collect(Collectors.toSet());

            Set<Character> set2 = s2.toLowerCase().chars()
                    .mapToObj(obj -> (char) obj)
                    .collect(Collectors.toSet());

            Set<Character> set3 = s3.toLowerCase().chars()
                    .mapToObj(obj -> (char) obj)
                    .collect(Collectors.toSet());

            if (set1.equals(set2) && set1.equals(set3)) {
                isAnagram = true;
            }
        }
        return isAnagram;
    }
}
