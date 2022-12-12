package main.java.learn;

import java.util.function.Predicate;

public class LogMethod {
    public static <S> void logIf(String logLevel,Predicate<S> predicate, S t, String userId, String message) {
        if (predicate.test(t)) {
            System.out.println(userId + " " + message);
        }
    }

    public static void main(String[] args){
        String str = "";
        Predicate<String> p = String::isEmpty;
        logIf("ERROR",p,str,"Shemeel","Empty");
    }
}
