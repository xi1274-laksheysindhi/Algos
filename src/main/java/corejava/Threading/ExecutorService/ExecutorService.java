package corejava.Threading.ExecutorService;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

// In case of executor service  like if we start 3 threads if all three threads are occupied in performimg task
// till then the task will be inside queue waiting for thread to get free
// when thread gets free it then perform tasks.
// we need not maintain threads ourself
public class ExecutorService {
    public static void main(String[] args) {
        // Getting instance of ThreadPoolExecutor using  Executors.newFixedThreadPool factory method
        // starting 5 threads
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        for (int i = 0; i < 10; i++) {

            // lambda implementation of runnable interface created
            Runnable r = () -> {
                    System.out.println("Thread running");
            System.out.println(Thread.currentThread().getName());
            };
            // runnale implementation is passes to execute method.
        threadPoolExecutor.execute(r);
        }
        threadPoolExecutor.shutdown();
    }
}
