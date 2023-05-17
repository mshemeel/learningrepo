package main.java.inheritance.test;

public class MainClassTest {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Dog dog = new Dog();
        //run-time inheritance
        Animal animal2 = new Dog();

        animal.print();
        animal.printProtected();
        Animal.printStatic();
        dog.print();
        dog.printProtected();
        animal2.printProtected();
        Dog.printStatic();
        animal.printFinal();
        dog.printFinal();

        System.out.println("*************************");
        Animal animal3 = new Dog();
    

    }
}
