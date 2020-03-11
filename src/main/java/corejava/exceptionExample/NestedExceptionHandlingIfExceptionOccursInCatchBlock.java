package corejava.exceptionExample;

/*
In case of nested Exception handling if exception occurs in catch block then same flow
 it will check till the bottom of stack of called methods if somewhere that exception is handled
 till the place where exception is handled all tasks will be not executed that were planned after occurance of exception
 */

class ChildForCatchBlockHandling {

    public void getExceptionPropagation() {
        try {
            try {
                int i = 10 / 0;

            } catch (ArithmeticException e) {
                int z = 20/0;
                System.out.println("ArithmeticException in child");
            }
        } catch (NumberFormatException e) {
            System.out.println("Number format exception");
        }
        System.out.println("As exception not catched so this task will not executed");
    }

}

class ParentForCatchBlockHandling {

    public void getExceptionPropagation() {
        try {
            try {
                new ChildForCatchBlockHandling().getExceptionPropagation();

            } catch (NumberFormatException e) {
                System.out.println("Number format exception");
            }
        } catch (NumberFormatException e) {
            System.out.println("Number format exception");
        }
        System.out.println("As exception not catched so this task will not executed");

    }
}

public class NestedExceptionHandlingIfExceptionOccursInCatchBlock {

    public static void main(String[] args) {
        try {
            try {
                new ParentForCatchBlockHandling().getExceptionPropagation();

            } catch (NumberFormatException e) {
                System.out.println("Number format exception");
            }
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
        System.out.println("As exception not catched so this task will not executed");

    }
}
