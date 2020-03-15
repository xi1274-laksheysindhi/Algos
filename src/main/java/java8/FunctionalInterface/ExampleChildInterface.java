package java8.FunctionalInterface;

// Functional Interface with only one Abstract method
// as ExampleChildInterface extends ExampleParentInterface so the abstract method m1 of ExampleParentInterface is in ExampleChildInterface
// so ExampleChildInterface also a functional interface
@FunctionalInterface
public interface ExampleChildInterface extends ExampleParentInterface{
    // overridden parent m1 method
    void m1();

    // It will get compile time error as functional interface only has 1 abstract method
    // that is being inherited from parent interface so another abstract method cannot be added
    //void m2();
}
