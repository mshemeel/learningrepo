package main.java.inheritance.test;

public class Animal {
    // public method
    public void print() {
        System.out.println("Animal");
    }

    //protected parent method
    protected void printProtected() {
        System.out.println("Protected Animal");
    }

    //static method cannot be overriden
    public static void printStatic() {
        System.out.println("Print Static Animal");
    }

    //cannot override private methods
    private void printPrivate(){
        System.out.println("print private animal");
    }

    //final method cannot be overriden
    public final void printFinal(){
        System.out.println("Print final Animal");
    }

    //exception scenario
    public void printWithException() throws Exception{
        System.out.println("Print Animal exception");
    }
    //exception scenario
    public void printWithRuntimeException() throws RuntimeException{
        System.out.println("Print Animal runtimeException");
    }

}
