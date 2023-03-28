package main.java.functionalinterface;
@FunctionalInterface
public interface SampleFunctionalInterface {
    public String hello();

    default public void saySome(){
        System.out.println("JHello");
    }

    default public void saySome2(){
        System.out.println("JHello");
    }
}
