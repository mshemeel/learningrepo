package main.java.probs;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * You have a string which is a mixture of letters, numbers, and special characters from which you have to produce the largest even number from the available digit after removing the duplicates digits.
 * <p>
 * If an even number did not produce then return -1
 * <p>
 * Testcase – 1 :
 * Input : infosys@337
 * Output : -1
 * Testcase – 2 :
 * Input : Hello#81@21349
 * Output : 984312
 * Testcase – 3 :
 * Input : Script10@Learners#&23#$422
 * Output : 43210
 */
public class FindHighestNumberFromString {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("-?\\d");
        Matcher m = p.matcher("Script10@Learners#&23#$422");
        TreeSet<String> sortedSet = new TreeSet<>(Comparator.reverseOrder());
        while (m.find()) {
            sortedSet.add(m.group());
        }

        if (Integer.parseInt(sortedSet.last()) % 2 == 0) {
            sortedSet.stream().forEach(System.out::print);
        } else {
            System.out.println("-1");
        }
    }
}
