package main.java.lambda;

public interface TestFunctionalInterface1 {
    public void tester();
    public default void log(){
        System.out.println("Log TestInterface1:-"+this.getClass().getSimpleName());
    }
}
