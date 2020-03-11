package corejava.finalExamples;

// 1. A final class cannot be extended(inherited). -> No child class can extend them
// 2. Final with class is used for making class is immutable
public class FinalClassExample {

    //We must declare methods with final keyword
    // for which we required to follow the same implementation throughout all the derived classes.
    final void m1()
    {
        System.out.println("This is a final method.");
    }

}
