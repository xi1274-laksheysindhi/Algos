package java8.FunctionalInterface;

// Functional Interface with only one Abstract method
// Functional interface can have any number of static and default methods
@FunctionalInterface
public interface ExampleParentInterface {
     void m1();
     static void m2() {

     }
     static void m3() {

     }

     default void m24() {

     }
}
