package java8.FunctionalInterface;

// As Runnable is functional interface in Java 8 so we have done its implementation using lamda expressions.
public class ImplementationWithRunnable {
    public static void main(String[] args) {
        Runnable r = () -> {
            for(int i=0; i < 20; i++) {
                System.out.println("child thread");
            }
        };
        Thread t = new Thread(r);
        t.start();
        for(int i=0; i < 20; i++) {
            System.out.println("Parent thread");
        }

    }
}
