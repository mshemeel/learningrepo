package main.java.serialization.externalization.example.externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Objects;

public class Person implements Externalizable {
    private String name;
    private int age;
    private String address;
    private String phone;

    // Default constructor
    public Person() {
    }

    // Parameterized constructor
    public Person(String name, int age, String address, String phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }


    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        // Read the fields from the input stream and assign them to the object
        name = (String) in.readObject();
        age = in.readInt();
        address = (String) in.readObject();
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        // Write only the required fields to the output stream
        out.writeObject(name);
        out.writeInt(age);
        out.writeObject(address);
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

}
