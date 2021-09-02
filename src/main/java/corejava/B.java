package corejava;

public class B extends A {
    int a = 15;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.getA());
        A ab = new B();
        System.out.println(ab.getA());
        B b = new B();
        System.out.println(b.getA());

    }
}
