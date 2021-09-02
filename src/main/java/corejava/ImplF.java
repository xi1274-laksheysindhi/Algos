package corejava;

public class ImplF implements InterfaceF{
    @Override
    public void print() {
        System.out.println(InterfaceF.a);
        System.out.println(a);

    }
}
