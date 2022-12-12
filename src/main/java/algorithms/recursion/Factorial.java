package main.java.algorithms.recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorialIterative(5));
        System.out.println(factorialRecursive(6));

    }

    public static Integer factorialRecursive(Integer number) {
        Integer factorial = number;
        if (number != 0) {
            factorial = factorial * factorialRecursive(number - 1);
        } else {
            factorial = 1;
        }
        return factorial;
    }

    public static Integer factorialIterative(Integer number) {
        //0! = 1
        //5 ! = 1*2*3*4*5
        Integer factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
