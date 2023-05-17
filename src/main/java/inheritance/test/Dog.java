package main.java.inheritance.test;

public class Dog extends Animal{
    public Dog(){
        super("Hello");
        System.out.println("Dog constructor");
    }

    public void print() {
        super.print(); // calls the parent class
        System.out.println("Dog");
    }

    @Override
    protected void printProtected(){
        System.out.println("Protected Dog");
    }

    public static void printStatic(){
        System.out.println("Print Static Dog");
    }

    //Cannot override private methods
    private void printPrivate(){
        System.out.println("print private dog");
    }

   /*
    cannot override final
   public final void printFinal(){
        System.out.println("Print final Animal");
    }*/

    public void printWithException() throws Exception{
        System.out.println("Print Dog with exception");
    }

    public void printWithRuntimeException() throws RuntimeException{
        System.out.println("Print Animal runtimeException");
    }
}
