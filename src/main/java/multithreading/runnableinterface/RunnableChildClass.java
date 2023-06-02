package main.java.multithreading.runnableinterface;

public class RunnableChildClass implements Runnable{
    @Override
    public void run() {
        System.out.println("RUN method of :"+this.getClass().getName());
    }
}
