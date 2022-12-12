package main.java.learn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/** string of integer "2232323213123"
 * if consequent even, then append "*" b/n digits
 * if consequent off then append "-"  b/n digits
 * **/

public class NewMain {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
//        String[] data = in.nextLine().split(" ");
//        int[] numbers = new int[data.length];
//        for (int i = 0; i < data.length; i++) {
//            numbers[i] = Integer.parseInt(data[i]);
//        }

        String data = in.nextLine();
        char[] charArray = data.toCharArray();
        List<String> str = new ArrayList<>();

        int i =0;
        boolean previousIsEven = false;
        for(char ch : charArray){
            //first Even
            if(i==0){
                str.add(String.valueOf(ch));
                if (isEven(ch)){
                    previousIsEven = true;
                }
            }else{
                if(previousIsEven){
                    if (isEven(ch)){
                        str.add("*");
                        previousIsEven = true;
                        str.add(String.valueOf(ch));
                    }else{
                        previousIsEven = false;
                        str.add(String.valueOf(ch));
                    }
                }else{
                    if(isEven(ch)){
                        str.add(String.valueOf(ch));
                        previousIsEven = true;
                    }else{
                        str.add("-");
                        previousIsEven = false;
                        str.add(String.valueOf(ch));
                    }
                }
            }
            i++;
        }
        String.join("",str);
        System.out.println(str);


    }

    private static boolean isEven(char ch) {
        if(ch%2==0){
            return  true;
        }
        return  false;
    }
}
