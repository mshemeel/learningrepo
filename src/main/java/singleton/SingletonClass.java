package main.java.singleton;

import java.io.Serial;
import java.io.Serializable;

/*
* Singleton Design pattern
* Only one instance of the object exist in the jvm
* */
public class SingletonClass implements Serializable {
    private static SingletonClass object;

    //private constructor
    private SingletonClass() {
        //to prevent breaking singleton using reflection
        if(object != null){
            throw new RuntimeException("instance of SingletonClass already exists !!");
        }

    }

    //to prevent breaking singleton class during deserialization
    @Serial
    protected Object readResolve(){
        return object;
    }

    //to prevent singleton class during cloning
    @Override
    protected Object clone() throws CloneNotSupportedException  {
        throw new CloneNotSupportedException();
    }


    //static getInstance method returns the instance
    public static synchronized SingletonClass getInstance() {
        if (object == null) {
            object = new SingletonClass();
        }
        return object;
    }

    public void printMessage(){
        System.out.println("Print from singleton class" + object);
    }


}
