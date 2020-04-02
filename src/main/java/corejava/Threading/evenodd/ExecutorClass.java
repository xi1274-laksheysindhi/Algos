package corejava.Threading.evenodd;

// For even odd problem.. first we need to pass the thread that is even thread
// that we are passing while creating new object of EvenOdd class
// Passing name of thread also
public class ExecutorClass {

    public static void main(String[] args) throws InterruptedException {

       // Even odd using synchronized method
       /* Printer p = new Printer();

        Thread even = new Thread(new EvenOdd(p, 10, true), "Even");

        Thread odd = new Thread(new EvenOdd(p, 10, false), "Odd");
        even.start();
        Thread.sleep(10000);
        odd.start();
        */
        // Even odd using synchronized block
        Object syncObject = new Object();
        Thread even = new Thread(new EvenOddUsingSynchronizedBlock(syncObject,10, true), "Even");

        Thread odd = new Thread(new EvenOddUsingSynchronizedBlock(syncObject,10, false), "Odd");
        even.start();
        odd.start();
    }
}