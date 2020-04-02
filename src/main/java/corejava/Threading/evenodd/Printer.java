package corejava.Threading.evenodd;

// Here we are working on object level locking
// have made method as synchronized
// and In ExecutorClass one object of Printer object is created that is passed
// At a time out of all methods in Printer object only 1 method will be called.

public class Printer {

    boolean printEven;

    public synchronized void printEven(int value) throws InterruptedException{

        if(!printEven) {
            wait();
        }

        System.out.println("Thread name is : "+Thread.currentThread().getName()+" : "+value);
        notify();
        printEven =false;
    }

    public synchronized void printOdd(int value) throws InterruptedException{

        if(printEven) {
            wait();
        }


        System.out.println("Thread name is : "+Thread.currentThread().getName()+" : "+value);
        notify();
        printEven =true;
    }
}
