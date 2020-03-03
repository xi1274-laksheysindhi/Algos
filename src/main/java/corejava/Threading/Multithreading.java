package corejava.Threading;

public class Multithreading {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            new Printer().print("Sachin") ;
        });
       t.setDaemon(true);
        t.start();
        Thread.sleep(1000);
    }
}

class Printer {

    public synchronized  void print(String s) {

        System.out.println(s);

    }
}
