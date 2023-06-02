package main.java.multithreading;

import main.java.multithreading.executorframework.RunnableTaskForExecutor;
import main.java.multithreading.runnableinterface.RunnableChildClass;
import main.java.multithreading.threadclass.ThreadClassChild;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * When you invoke the start() method,
 * the JVM takes care of initializing the new thread,
 * allocating resources, and setting up the execution environment.
 * It transitions the thread through its lifecycle,
 * including calling the run() method at the appropriate time.
 * <p>
 * If you call the run() method directly,
 * you bypass this initialization process
 * and lose the benefits provided by the JVM for managing threads.
 */
public class MainClass {
    public static void main(String[] args) {
        //Extending thread class
        ThreadClassChild threadClassChild = new ThreadClassChild();
        threadClassChild.start();
        System.out.println("Main Thread");

        // Should not do this even though no compilation issue
        threadClassChild.run();

        // this will throw IllegalThreadState exception since start() is already called
        //threadClassChild.start();

        //Implementing Runnable interface
        Thread thread = new Thread(new RunnableChildClass());
        thread.start();
        System.out.println("Main Thread");
        //this will also work but should not do it -> since JVM will lose control of thread creation
        thread.run();

        //Executor framework

        //single thread
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        RunnableTaskForExecutor runnableTaskForExecutor = new RunnableTaskForExecutor();
        singleThreadExecutor.execute(runnableTaskForExecutor);
        singleThreadExecutor.shutdown();

        //Fixed thread pool
        int numThreads = 5;
        ExecutorService fixedThreadPoolExecutor = Executors.newFixedThreadPool(numThreads);
        for (int i = 0; i < 10; i++) {
            fixedThreadPoolExecutor.execute(() -> {
                // Task to be executed
                System.out.println("Task executed by fixed thread pool");
            });

        }
        fixedThreadPoolExecutor.shutdown();

        //Cached Thread pool
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            cachedThreadPool.execute(() -> {
                // Task to be executed
                System.out.println("Task executed by cached thread pool");
            });
        }
        cachedThreadPool.shutdown();


        //Callable
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<Integer>> futures = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int taskNumber = i;
            Future<Integer> future = executor.submit(() -> {
                // Callable task to be executed
                System.out.println("Executing task " + taskNumber);
                return taskNumber * 2;
            });
            futures.add(future);
        }

        // Collecting results
        for (Future<Integer> future : futures) {
            try {
                int result = future.get();
                System.out.println("Task result: " + result);
            } catch (InterruptedException | ExecutionException e) {
                // Handle exceptions
            }
        }

        executor.shutdown();

    }
}
