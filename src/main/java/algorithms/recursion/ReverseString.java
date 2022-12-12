package main.java.algorithms.recursion;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseRecursion("Hello"));
    }

    public static String reverseRecursion(String str) {
        int length = str.length();
        if (length <= 1) {
            return str;
        }
        StringBuilder result = new StringBuilder().append(str.substring(length - 1));
        result.append(reverseRecursion(str.substring(0, length - 1)));
        return result.toString();
    }
}
