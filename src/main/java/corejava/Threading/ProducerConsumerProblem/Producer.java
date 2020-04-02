package corejava.Threading.ProducerConsumerProblem;

import java.util.Queue;

public class Producer implements Runnable {

    Queue<Task> workQueue;

    public Producer(Queue workQueue) {
        this.workQueue = workQueue;
    }




    @Override
    public void run() {
        while(true) {
            synchronized (workQueue) {
                if (workQueue.isEmpty()) {
                    workQueue.add(new Task("Task"));
                    System.out.println("Task Produced by : "+Thread.currentThread().getName());
                    workQueue.notify();
                } else {
                    try {
                        workQueue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
