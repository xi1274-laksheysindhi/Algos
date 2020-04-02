package corejava.singleton;

// Early initialization simple method of creating singleton class.
// Object is created when it is loaded to JVM Memory. it is THREAD SAFE
// private constructor
// private static final Object of Class.
public class SingletonExample {


    // Early initialization WAY1
    private static SingletonExample INSTANCE = new SingletonExample();

    static {
        // Early Initialization WAY2
        // INSTANCE = new SingletonExample();
    }

    private SingletonExample() {

    }

    /*
    Making getInstance thread safe using synchronized keyword
    this will hit performance as only one thread will be able to access this method at one time
     */
   /* public static synchronized  SingletonExample getInstance() {
        //LAZy initialization check if instance is not there create one else not
        //This way is not thread safe need to make it safe
        if(INSTANCE == null) {
            return new SingletonExample();
        }
        return INSTANCE;
    }*/

    //Lazy initialization with Double check locking:
/*
    public static SingletonExample getInstance() {
        //LAZy initialization check if instance is not there create one else not
        //This way is not thread safe need to make it safe
        if(INSTANCE == null) {
            return new SingletonExample();
        }
        return INSTANCE;
    }*/

    //In this method, getInstance is not synchronized but the block which creates instance is synchronized so that minimum number of threads have to wait and that’s only for first time.
    //Lazy initialization is possible.
    //It is also thread safe.
    //Performance overhead gets reduced because of synchronized keyword.


    // FINAL 4th approach
    public static SingletonExample getInstance() {
        return BillPughSingleton.INSTANCE;
    }

    // Inner class to provide instance of class  Inner class will be initialized when we call getInstance
    //It is lazy initialization
    private static class BillPughSingleton {
        private static final SingletonExample INSTANCE = new SingletonExample();
    }


}
