package corejava.exceptionExample;

// In case of NESTED EXCEPTION HANDLING  if exception arises in nested nested try block
// but the corresponding catch block is not catching the exception then flow will check in parent catch block if that exception is handled or not

public class NestedExceptionHandling {

    public static void main(String[] args) {
        try {

            try {

                int i = 10/0;

            } catch (ArithmeticException e) {
                System.out.println("arithmetic");
            }

            try {
                String s = null;
                s.length();

            } catch (NullPointerException e) {
                System.out.println("null");
            }

            System.out.println("Nesting did not broke after this");


            try {
                // here exception thrown is arithmetic exception but that is not handled in catch block
                // so it will throw exception and same exception is catched in outer catch block so it is handled gracefully
                int i = 10/0;
            } catch (NumberFormatException e) {
                System.out.println("number format exception");
            }
            // this action will not be performed as the flow will be thrown out from this
            System.out.println("Nesting broke after this");

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception outer Exception");
        }  catch (Exception e) {
            System.out.println("Exception");
        }

        // this will be running succesfully as exception is handled before that
        System.out.println("Worked perfectly fine");
    }
}
