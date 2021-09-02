package corejava.Threading.Practice;

import java.io.FileNotFoundException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Test implements Callable {




    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask f = new FutureTask(new Test());

        Thread t = new Thread(f);
        t.start();
        System.out.println("before");
        System.out.println(f.get());
        System.out.println("after");

//        Thread t = new Thread(new Test());
//        t.start();
    }

    @Override
    public Object call() throws FileNotFoundException {

        throw new FileNotFoundException();
//        for(int i = 0; i < 50; i++) {
//        Thread.sleep(1000);
//        System.out.println("call");
//        }

    }
}
