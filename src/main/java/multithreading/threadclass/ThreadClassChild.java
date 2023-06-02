package main.java.multithreading.threadclass;

public class ThreadClassChild extends Thread{
    @Override
    public void run() {
        System.out.println("RUN method of :"+ this.getClass().getName());
    }
}
