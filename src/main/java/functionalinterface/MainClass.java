package main.java.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;

public class MainClass {
    public static void main(String[] args) {

        SampleFunctionalInterface fi = () -> {
            return "Hello";
        };

        System.out.println(fi.hello());

        List<Student> studentList = new ArrayList<>();

        List<Student> collect = studentList.stream()
                .sorted(comparing(Student::getAge,reverseOrder()))
                .collect(Collectors.toList());
    }
}
