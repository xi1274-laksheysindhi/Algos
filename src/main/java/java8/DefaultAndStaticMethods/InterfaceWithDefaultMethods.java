package java8.DefaultAndStaticMethods;

// In case of interface we were having 2 abstract methods in starting that is m1 , m2
// and we are having currently 2 implementations of our interface A and B
// but suddenly after sometime we need to add one more method m3 in interface
// so if we add in interface all the implementations of our interface should implement our method
// but if we have 100 implementations of our interface then it would be problem
// we will add m3 method as default so that if one class want to provide its implementation it can provide otherwise
// it doesnot give error
public interface InterfaceWithDefaultMethods {
    void m1();

    void m2();

    default void m3() {

    }
}

class A implements InterfaceWithDefaultMethods {

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }
}

class B implements InterfaceWithDefaultMethods {

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }


    @Override
    public void m3() {

    }
}