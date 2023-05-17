package main.java.singleton;

public class CloningSingleton {
    public static void main(String[] args) throws CloneNotSupportedException, Exception {
        SingletonClass instanceOne = SingletonClass.getInstance();
        SingletonClass instanceTwo = (SingletonClass) instanceOne.clone();
        System.out.println("hashCode of instance 1 - " + instanceOne.hashCode());
        System.out.println("hashCode of instance 2 - " + instanceTwo.hashCode());
    }
}
