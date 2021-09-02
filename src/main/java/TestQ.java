import java.util.Objects;

public class TestQ {
    int A;
    String B;
    int C;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestQ testQ = (TestQ) o;
        return A == testQ.A;
    }

    @Override
    public int hashCode() {
        return Objects.hash(A);
    }
}


