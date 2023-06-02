package main.java.multithreading.executorframework;

public class RunnableTaskForExecutor implements Runnable{
    @Override
    public void run() {
        System.out.println("RUN method of:"+this.getClass().getName());
    }
}
