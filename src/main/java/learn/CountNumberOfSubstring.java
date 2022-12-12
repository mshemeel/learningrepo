package main.java.learn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountNumberOfSubstring {
    private static final String SUBSTRING = "ABC";
    private static final Pattern pattern = Pattern.compile(SUBSTRING);

    public static void main(String [] args){
        String strMain = "ACCABCSCSDERABCRRWAABC";
        String subStr = "ABC";

        int index = 0,count =0;
        while(true){
            index = strMain.indexOf(subStr,index);
            if(index != -1){
                index += subStr.length();
                count ++;
            } else{
                break;
            }
        }
        System.out.println(count);

        int patternCount = 0;
        Matcher matcher = pattern.matcher(strMain);
        while (matcher.find()) {
            patternCount++;
        }

        System.out.println(patternCount);
    }
}
