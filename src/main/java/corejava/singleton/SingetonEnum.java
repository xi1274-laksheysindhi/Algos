package corejava.singleton;

// As using classes making private constructor we were able to achieve singleton behavior
//But Using reflection concept we can make constructor property as accesible and we can create other object
// so to protect that we can use enum whose only single instance is only created in JVM
public enum SingetonEnum {
        INSTANCE;

        int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
