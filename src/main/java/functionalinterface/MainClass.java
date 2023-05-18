package main.java.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;

public class MainClass {
    public static void main(String[] args) {

        // Functional Interface without arguments
        SampleFunctionalInterface fi = () -> "Hello";
        System.out.println(fi.hello());

        //Functional Interface with arguments
        MyFunctionalInterface myFI = x ->  "Hello "+x;
        System.out.println(myFI.printName("Shemeel"));
    }
}
