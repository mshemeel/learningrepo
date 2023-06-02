package main.java.lambda;

import main.java.lambda.pojo.Person;

import java.util.*;
import java.util.stream.Collectors;

public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person("Venkat", 35, "11061991", 1200, "19052023","HR");
        Person p2 = new Person("Venkat", 35, "11061991", 1200, "19052023","HR");
        Person p3 = new Person("tom", 25, "11061998", 1000, "19052023","HR");
        Person p4 = new Person("Cat", 33, "110619987", 1200, "19052023","IT");
        Person p5 = new Person("Jboss", 45, "11061981", 1200, "19052023","IT");
        Person p6 = new Person("Jetty", 35, "11061971", 1500, "19052023","MANAGER");
        Person p7 = new Person("Was", 23, "11061985", 900, "19052023","ADMIN");

        //Non duplicate collection
        Set<Person> personSet = new HashSet<>();

        personSet.add(p1);
        personSet.add(p2);
        personSet.add(p7);
        personSet.add(p3);
        personSet.add(p4);
        personSet.add(p5);
        personSet.add(p6);

        System.out.println(personSet);

        //First sort by age then by Name
        List<Person> sortedSet = personSet.stream()
                .sorted(Comparator.comparing(Person::getAge)
                        .thenComparing(Person::getName))
                .collect(Collectors.toList());

        System.out.println(sortedSet);

        //average age
        Double averageAge = personSet.stream()
                .collect(Collectors.averagingDouble(Person::getAge));
        System.out.println("Average age ->"+ averageAge);

        //average salary of each dept
        Map<String, Double> averageSalaryInDept = personSet.stream()
                .collect(Collectors.groupingBy(Person::getDepartment, Collectors.averagingDouble(Person::getSalary)));
        System.out.println("Average Salary in each dept ->"+ averageSalaryInDept);

    }
}
