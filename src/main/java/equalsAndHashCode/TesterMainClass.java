package main.java.equalsAndHashCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TesterMainClass {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Muhammed","Shemeel","M","28","22-01-2022");
        Student s2 = new Student(1,"Muhammed","Shemeel","M","28","22-01-2022");
        Student s3 = new Student(1,"Muhammed","Shemeel","M","28","22-01-2022");

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        HashMap<Student,String> studentMap = new HashMap<>();

        students.forEach(student -> {
            if(!studentMap.containsKey(student)){
                studentMap.put(student,"Hi");
                System.out.println("Student added");
            }else{
                System.out.println("Duplicate Student");
            }
        });

        System.out.println(studentMap);
    }
}
