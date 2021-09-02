package corejava;

import java.util.Objects;

public class A{

    int a = 10;
    String b = "laksye";
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a1 = (A) o;
        return a == a1.a && Objects.equals(b, a1.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
