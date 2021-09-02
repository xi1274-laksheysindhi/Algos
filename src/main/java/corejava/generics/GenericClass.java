package corejava.generics;

public class GenericClass<T, U, X> {

    T t;
    U u;
    X x;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public U getU() {
        return u;
    }

    public void setU(U u) {
        this.u = u;
    }

    public X getX() {
        return x;
    }

    public void setX(X x) {
        this.x = x;
    }

    public <Z> void genericMethod(Z input) {
        System.out.println(input);
    }

    public <Z, T> void genericMethod(Z input, T input2) {
        System.out.println(input);
        System.out.println(input2);

    }
}
