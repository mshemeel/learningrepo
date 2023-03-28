package main.java.lambda;

@FunctionalInterface
public interface TestFunctionalInterface2 {
    public void test();
    public default void log(){
        System.out.println("Log:-"+this.getClass().getSimpleName());
    }
}
