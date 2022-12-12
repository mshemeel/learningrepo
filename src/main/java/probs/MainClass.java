package main.java.probs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {
    public static void main(String[] args) throws IOException {
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        // Reading data using readLine
        String name = reader.readLine();
        // Printing the read line
        System.out.println(name);

        String exception = "IOException|Message";
        System.out.println(getExceptionMessage(exception));
    }

    private static String getExceptionMessage(String exceptionString){
        String [] exceptionArr = exceptionString.split("\\|");
        String exceptionType = exceptionArr[0];
        String finalMessage = getMessageWithPriority(exceptionType);
        return new StringBuilder().append(exceptionString).append("|").append(finalMessage).toString();
    }

    private static String getMessageWithPriority(String exceptionType) {
        switch(exceptionType){
            case "IOException" :
                return "1"+"|"+"200";
            case "Exception" :
                return "2"+"|"+"400";
            default:
                return null;
        }
    }
}
