package corejava.Threading.callable;

import java.util.concurrent.Callable;

public class FactorialTask implements Callable<Integer> {
    int number;

    public FactorialTask(int number) {
        this.number = number;
    }

    // standard constructors

    public Integer call() {
        int fact = 1;
        // ...
        for(int count = number; count > 1; count--) {
            fact = fact * count;
        }

        return fact;
    }
}
