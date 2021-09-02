package corejava.exceptionExample;

/*
The JVM firstly checks whether the exception is handled or not. If exception is not handled, JVM provides a default exception handler that performs the following tasks:

Prints out exception description.
Prints the stack trace (Hierarchy of methods where the exception occurred).
Causes the program to terminate.
 */

/*
At a time only one exception occurs and at a time only one catch block is executed.
All catch blocks must be ordered from most specific to most general, i.e. catch for ArithmeticException must come before catch for Exception.
 */
/*
Finally block in java can be used to put "cleanup" code such as closing a file, closing connection etc.
 */
/*
For each try block there can be zero or more catch blocks, but only one finally block.
 */
/*
The finally block will not be executed if program exits(either by calling System.exit() or by causing a fatal error that causes the process to abort).
 */

/*
Unchecked or runtime exceptions are under programmer's control throws and all should be used for checked exception
 */
public class SimpleExceptionExample {

    public static void main(String[] args) {
        try {

            String s = null;

            System.out.println("before exception");

            throw new Exception("");
            //as s = null unchecked exception will be thrown so before exception line will be printed but not after exception
            /*s.length();

            System.out.println("after exception");*/

        } catch (Exception
                e) {

            String s = null;
            s.length();
            System.out.println(e);

        }

        // this will be printed as it is out of try block and will run as exception is already catched
        System.out.println("out of exception block");
    }
}
