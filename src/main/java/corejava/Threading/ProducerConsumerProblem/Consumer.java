package corejava.Threading.ProducerConsumerProblem;

import java.sql.SQLOutput;
import java.util.Queue;

public class Consumer implements Runnable {

    Queue workQueue;

    public Consumer(Queue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public void run() {

        synchronized (workQueue) {
            while(true) {
                if (workQueue.isEmpty()) {
                    try {
                        workQueue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                } else {
                    System.out.println("Task consumed by : "+Thread.currentThread().getName()+ ""+workQueue.poll());
                    workQueue.notify();
                }
            }
        }
    }
}
