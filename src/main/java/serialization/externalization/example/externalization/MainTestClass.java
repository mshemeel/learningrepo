package main.java.serialization.externalization.example.externalization;

import java.io.*;
import java.util.Comparator;
import java.util.TreeSet;

public class MainTestClass {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Create a Person object
        Person person = new Person("John Doe", 30, "123 Main St", "555-1234");

        // Serialize the object to a file
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"));
        out.writeObject(person);
        out.close();

        // Deserialize the object from the file
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"));
        Person restoredPerson = (Person) in.readObject();
        in.close();

        // Print the restored object to verify it was deserialized correctly
        System.out.println(restoredPerson.getName() + " is " + restoredPerson.getAge() + " years old and lives at " + restoredPerson.getAddress());

        TreeSet<Person> personTreeSet = new TreeSet<>(Comparator.comparing(Person::getAge));
        Person person1 = new Person("John Doe1", 25, "123 Main St", "555-1234");
        Person person2 = new Person("John Doe2", 29, "123 Main St", "555-1234");
        Person person3 = new Person("John Doe3", 21, "123 Main St", "555-1234");
        Person person4 = new Person("John Doe4", 24, "123 Main St", "555-1234");
        Person person5 = new Person("John Doe5", 26, "123 Main St", "555-1234");

        personTreeSet.add(person1);
        personTreeSet.add(person2);
        personTreeSet.add(person3);
        personTreeSet.add(person4);
        personTreeSet.add(person5);

        personTreeSet.stream().forEach(System.out::println);



    }
}
