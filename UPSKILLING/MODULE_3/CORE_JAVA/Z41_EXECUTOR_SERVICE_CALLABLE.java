package UPSKILLING.MODULE_3.CORE_JAVA;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Z41_EXECUTOR_SERVICE_CALLABLE {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Callable<String>> tasks = new ArrayList<>();
        tasks.add(() -> "Task 1 result");
        tasks.add(() -> "Task 2 result");
        tasks.add(() -> "Task 3 result");

        List<Future<String>> futures = executor.invokeAll(tasks);
        for (Future<String> future : futures) {
            System.out.println(future.get());
        }
        executor.shutdown();
    }
}
