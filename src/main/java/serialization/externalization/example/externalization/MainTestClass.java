package main.java.serialization.externalization.example.externalization;

import java.io.*;

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
    }
}
