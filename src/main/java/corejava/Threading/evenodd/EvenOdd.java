package corejava.Threading.evenodd;

// In Even odd class
// Suppose fist even thread came we will vake int variable value as 2 and pass to printer.printEven method
// there we have kept variale that that is false by default
// and it will check if odd is not printed first even thread will be moved to waiting state
// when the odd thread will come and print it will call notify then even waiting thread will print
// next time value will be incremented by 2
public class EvenOdd implements Runnable {
    Printer printer;
    int max;
    boolean isEvenThread;

    public EvenOdd(Printer printer, int max, boolean isEvenThread) {
        this.printer = printer;
        this.max = max;
        this.isEvenThread = isEvenThread;
    }

    int value;

    @Override
    public void run() {
        value = isEvenThread ? 2 : 1;
        while(value <= max) {

            if(value%2 != 0) {
                try {
                    printer.printOdd(value);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else{
                try {
                    printer.printEven(value);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            value =value+2;
        }

    }
}
