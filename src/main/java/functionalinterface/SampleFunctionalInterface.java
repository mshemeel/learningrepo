package main.java.functionalinterface;
@FunctionalInterface
public interface SampleFunctionalInterface {
    public String hello();

    // we can have multiple default methods in a functional interface
    default public void saySome(){
        System.out.println("JHello SaySome");
    }

    default public void saySome2(){
        System.out.println("JHello SaySome2");
    }
}
