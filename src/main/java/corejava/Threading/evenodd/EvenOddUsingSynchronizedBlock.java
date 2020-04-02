package corejava.Threading.evenodd;

public class EvenOddUsingSynchronizedBlock implements Runnable {

    int max;
    volatile boolean isEvenThread;
    volatile boolean printEven;
    Object syncObject;


    public EvenOddUsingSynchronizedBlock(Object syncObject, int max, boolean isEvenThread) {
        this.max = max;
        this.isEvenThread = isEvenThread;
        this.syncObject = syncObject;
    }

    int value;

    @Override
    public void run() {
        value = isEvenThread ? 2 : 1;
        while(value <= max) {

            if(value%2 != 0) {
                try {
                    synchronized (syncObject) {
                        if(printEven) {
                            syncObject.wait();
                        }


                        System.out.println("Thread name is : "+Thread.currentThread().getName()+" : "+value);
                        printEven =true;
                        syncObject.notify();

                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else{
                try {
                    synchronized (syncObject) {
                        if(!printEven) {
                            syncObject.wait();
                        }

                        System.out.println("Thread name is : "+Thread.currentThread().getName()+" : "+value);
                        printEven =false;
                        syncObject.notify();

                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            value =value+2;
        }

    }
}
