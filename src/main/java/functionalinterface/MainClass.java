package main.java.functionalinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;

public class MainClass {
    public static void main(String[] args) {

        // Functional Interface without arguments
        SampleFunctionalInterface fi = () -> "Hello";
        System.out.println(fi.hello());

        // calling default method
        fi.saySome();
        fi.saySome2();

        //Functional Interface with arguments
        MyFunctionalInterface myFI = x ->  "Hello "+x;
        System.out.println(myFI.printName("Shemeel"));

        // Pre-defined functional interfaces
        //Predicate -> consumes the arg and return boolean
        Predicate<Integer> predicate = x -> x > 5;
        System.out.println(predicate.test(10));

        //Supplier -> does not accept any arg but returns an arg
        Supplier<String> supplier = () -> "Hello World";
        System.out.println(supplier.get());

        //Consumer -> consumes the arg but returns no value
        Consumer<String> consumer = x -> System.out.println("Hello "+x);
        consumer.accept("Shemeel");

        //Function -> accepts and arg and returns a value
        Function<Integer, String> function = x -> "The number is :" + x;
        System.out.println(function.apply(10));


    }
}
