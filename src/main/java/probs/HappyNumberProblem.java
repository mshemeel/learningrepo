package main.java.probs;

/** Happy Number ->
 *  16 => 1square + 6sqaure
 *  repeat until getting 1,
 *  if 1 is final, then happy number
 *
 *  loop: number
 *      add to hashset if number !=1 & it is not already present in it,
 *          once the repeatation comes , return false
 *   if number == 1 true
 *
 * **/
import java.util.HashSet;
import java.util.Set;

public class HappyNumberProblem {

    public static void main(String[] args) {
        System.out.println(isHappy(200));
    }

    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while(n!=1 && !seen.contains(n)){
            seen.add(n);
            n= sumOfSquare(n);
        }
        if(n ==1){
            return true;
        }
        return false;
    }

    private static int sumOfSquare(int n) {
        String number = String.valueOf(n);
        char[] charArr = number.toCharArray();
        int sum = 0;
        for (char ch : charArr) {
            sum += Math.pow(Integer.parseInt(String.valueOf(ch)), 2);
        }
       return sum;
    }

}
