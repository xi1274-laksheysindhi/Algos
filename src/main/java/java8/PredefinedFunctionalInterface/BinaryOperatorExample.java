package java8.PredefinedFunctionalInterface;


import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/*
It is child interface of bi function
If we want same type input( here 2 input parameters) and same return type
then we should use binary orperator
 */
public class BinaryOperatorExample {

    public static void main(String[] args) {
        BinaryOperator<Integer> u = (i,j) -> i*j*2;

        System.out.println(u.apply(2,4));
    }
}
