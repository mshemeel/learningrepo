package main.java.lambda.questions;

public interface TestFunctionalInterface2 {
    public void test();
    public default void log(){
        System.out.println("Log:-"+this.getClass().getSimpleName());
    }
}
