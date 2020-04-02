package corejava.Threading.ProducerConsumerProblem;

import java.util.LinkedList;
import java.util.Queue;

public class Executor {

    public static void main(String[] args) {
        Queue<Task> queue = new LinkedList();

        Thread producerThread = new Thread(new Producer(queue), "Producer");

        Thread consumerThread = new Thread(new Consumer(queue), "Consumer");


        producerThread.start();
        consumerThread.start();
    }
}
