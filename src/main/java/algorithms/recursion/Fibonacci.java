package main.java.algorithms.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("0 -> " + fibonacciIterative(0));
        System.out.println("1 -> " + fibonacciIterative(1));
        System.out.println("2 -> " + fibonacciIterative(2));
        System.out.println("6 -> " + fibonacciIterative(6));
        System.out.println("8 -> " + fibonacciIterative(8));
        System.out.println("------------------------------------------>");
        System.out.println("0 -> " + fibonacciRecursive(0));
        System.out.println("1 -> " + fibonacciRecursive(1));
        System.out.println("2 -> " + fibonacciRecursive(2));
        System.out.println("6 -> " + fibonacciRecursive(6));
        System.out.println("8 -> " + fibonacciRecursive(8));
    }

    public static Integer fibonacciRecursive(Integer number) {
        if (number < 2) {
            return number;
        }
        return fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2);
    }


    public static String fibonacciIterative(Integer number) {
        if (number == 0) {
            return String.valueOf(0);
        }
        if (number == 1) {
            return String.valueOf(0) +
                    "," +
                    String.valueOf(1);
        }
        StringBuilder builder = new StringBuilder();
        int first = 0;
        int second = 1;
        builder.append(String.valueOf(first)).append(",").append(String.valueOf(second));
        int counter = number - 2;
        int finalValue = 0;
        while (counter >= 0) {
            int nextNum = first + second;
            builder.append(",").append(String.valueOf(nextNum));
            first = second;
            second = nextNum;
            finalValue = nextNum;
            counter--;
        }
        return builder.toString();
    }
}

