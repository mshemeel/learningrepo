package main.java.probs;

//Number should be divisible only by 1 & itself
public class PrimeNumber {
    public static void main(String[] args) {
        int number = 391;
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);
    }
}
