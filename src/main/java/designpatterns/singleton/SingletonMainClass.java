package main.java.designpatterns.singleton;

public class SingletonMainClass {
    public static void main(String[] args) {
        SingletonClass obj1 = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();
        System.out.println("Hashcode of Object 1 - " + obj1.hashCode());
        System.out.println("Hashcode of Object 2 - " + obj2.hashCode());
    }
}
