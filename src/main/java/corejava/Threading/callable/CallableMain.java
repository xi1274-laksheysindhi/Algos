package corejava.Threading.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class CallableMain {

    public static void main(String[] args) {
        FactorialTask task = new FactorialTask(5);
        FutureTask f = new FutureTask(task);
//        Thread tf = new Thread(f);
//        tf.start();
        try {
            f.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
