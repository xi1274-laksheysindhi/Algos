package corejava.exceptionExample;

/*
An exception is first thrown from the top of the stack and if it is not caught,
it drops down the call stack to the previous method,If not caught there,
the exception again drops down to the previous method,
and so on until they are caught or until they reach the very bottom of the call stack.
This is called exception propagation.
 */

/*
In this case exception arose in the child class but child was not having appropriate exception handler
so execution terminated from there and moved to  from where that method was called in stack
checked if there exception is caught or not
and it is also not caught there , it terminated from there also and then
from main method
if appropriate exception handler is there then it will be caught and execution will be ended correctly else
it will end up throwing exception

in our case we have provided appropriate exception handler so will will be handled and rest of code will be executed perfectly
 */

class Child {

    public void getExceptionPropagation() {
        try {
            try {
                int i = 10 / 0;

            } catch (NumberFormatException e) {
                System.out.println("Number format exception");
            }
        } catch (NumberFormatException e) {
            System.out.println("Number format exception");
        }
        System.out.println("As exception not catched so this task will not executed");
    }

}

class Parent {

    public void getExceptionPropagation() {
        try {
            try {
                new Child().getExceptionPropagation();

            } catch (NumberFormatException e) {
                System.out.println("Number format exception");
            }
        } catch (NumberFormatException e) {
            System.out.println("Number format exception");
        }
        System.out.println("As exception not catched so this task will not executed");

    }
}

public class ExceptionPropagation {

    public static void main(String[] args) {
        try {
            try {
                new Child().getExceptionPropagation();

            } catch (NumberFormatException e) {
                System.out.println("Number format exception");
            }
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
        System.out.println("As exception not catched so this task will not executed");

    }
}
