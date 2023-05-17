package main.java.probs;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParanthesis {
    public static void main(String[] args) {
        System.out.println(isValid("(]"));
    }

    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isOpeningBracket(ch)) {
                stack.push(ch);
            } else {
                if (stack.isEmpty() || !isMatching(ch, stack.pop())) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatching(Character close, Character open) {
        if (open == '(' && close != ')')
            return false;
        if (open == '[' && close != ']')
            return false;
        if (open == '{' && close != '}')
            return false;
        else
            return true;
    }

    private static boolean isOpeningBracket(char ch) {
        boolean isOpening = false;
        switch (ch) {
            case '{':
            case '(':
            case '[':
                isOpening = true;

        }
        return isOpening;
    }
}
