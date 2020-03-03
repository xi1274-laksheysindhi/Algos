package corejava.finalExamples;

/*
Final instance variables need to be initialized at time of declaration
or if static then initialized in static block
and if non static initialized in all constructors
 */

//final variables must be used only for the values that we want to remain constant throughout the execution of program.
public class FinalInstanceVariables {

     final int age;
     static final int number;

     // blank final variable if final variable is initialized in Constructor
    // final variables need to be initialized in all constructor
    FinalInstanceVariables() {
        this.age = 10;
    }

    public FinalInstanceVariables(int name) {
        this.age = name;
    }

    static  {

        number = 911;
    }

}
