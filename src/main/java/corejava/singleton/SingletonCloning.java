package corejava.singleton;


// for avoiding cloning
// as for cloning we need to call object class clone method from our class by doing super.clone();
// we  call object class clone method
// so we can return same instance or CloneNotSupportedException exception

public class SingletonCloning implements Cloneable {

    private static SingletonCloning INSTANCE = new SingletonCloning();


    private SingletonCloning() {
    }

    public static SingletonCloning getInstance() {

        if (INSTANCE == null) {
            return new SingletonCloning();
        }
        return INSTANCE;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return INSTANCE;
    }
}
