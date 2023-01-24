package main.java.singletondesignpattern;

public class SingletonMainClass {
    public static void main(String[] args) {
        SingletonClass obj1 = SingletonClass.getInstance();
        obj1.printMessage();

        SingletonClass obj2 = SingletonClass.getInstance();
        obj2.printMessage();
    }
}
