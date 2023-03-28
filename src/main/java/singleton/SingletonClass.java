package main.java.singleton;

/*
* Singleton Design pattern
* Only one instance of the object exist in the jvm
* */
public class SingletonClass {
    private static SingletonClass object;

    private SingletonClass() {

    }

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
