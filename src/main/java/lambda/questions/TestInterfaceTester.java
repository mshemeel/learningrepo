package main.java.lambda.questions;

public class TestInterfaceTester implements TestFunctionalInterface1{

    @Override
    public void tester() {
        log();
    }

    @Override
    public void log() {
        System.out.println("From class log ");
    }
}
