package main.java.multithreading.executorframework;

import java.util.concurrent.Callable;

public class CallableTaskForExecutor implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "CALL method of"+this.getClass().getName();
    }
}
