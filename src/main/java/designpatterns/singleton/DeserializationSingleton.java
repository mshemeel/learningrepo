package main.java.designpatterns.singleton;

import java.io.*;

public class DeserializationSingleton {
    public static void main(String[] args) throws Exception {

        SingletonClass instanceOne = SingletonClass.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
        out.writeObject(instanceOne);
        out.close();

        ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));
        SingletonClass instanceTwo = (SingletonClass) in.readObject();
        in.close();

        System.out.println("hashCode of instance 1 is - " + instanceOne.hashCode());
        System.out.println("hashCode of instance 2 is - " + instanceTwo.hashCode());
    }
}
