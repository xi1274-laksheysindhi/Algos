package corejava.hashing;

// equals by default that is present in object class compares hashcode and == also compares hash code
// we can provide equals our own implementation
// if 2 objects are equal by equals then their hashcode must be same
// but if hashcode of 2 objects is may they may or maynot ne equal by eqauls.
// it is recommended that if we override equals in our class then we should override should hashcode in our class
// to avoid inconsistency

public class EqualsAndHashCode {

    int id;
    String name;

    public EqualsAndHashCode(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EqualsAndHashCode)) return false;
        EqualsAndHashCode that = (EqualsAndHashCode) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
