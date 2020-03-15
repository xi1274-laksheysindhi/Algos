package java8.PredefinedFunctionalInterface;

import java.util.function.UnaryOperator;

/*
It is child interface of function
If we want same type input and same return type
then we should use unary orperator
 */
public class UnaryOperatorExample {

    public static void main(String[] args) {
        UnaryOperator<Integer> u = i -> i*2;

        System.out.println(u.apply(2));
    }
}
