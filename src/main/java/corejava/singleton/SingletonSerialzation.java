package corejava.singleton;

import java.io.Serializable;

// property of singleton can be broken when we serialize class and then deserialze a class
//when we deseriale class we get new object so new object is created of that singleton class
// Singleton property of that class is broken so solution to that is
public class SingletonSerialzation implements Serializable {

    private static SingletonSerialzation INSTANCE = new SingletonSerialzation();


    private SingletonSerialzation() {
    }

    public static SingletonSerialzation getInstance() {

        if (INSTANCE == null) {
            return new SingletonSerialzation();
        }
        return INSTANCE;
    }

    protected Object readResolve() {
        return INSTANCE;
    }
}
