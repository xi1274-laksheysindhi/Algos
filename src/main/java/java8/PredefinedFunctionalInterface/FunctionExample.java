package java8.PredefinedFunctionalInterface;


import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;


/*
Function is used for one input and 1 output
We can you function where to use input and return some value
Function deals with single input
Bi Function deals with 2 inputs

Function chaining can also be done that output of 1 function will be input to another function

 */

public class FunctionExample {

    public static void main(String[] args) {

        Function<String, Integer> function = s -> s.length();

        Function<Integer, Integer> functionChain = i -> i*2;


        IntFunction<Integer> fun = i -> i*2;

        BiFunction<String, Integer, Integer>  f = (s,i) -> s.length() > i ? 10 : 10000;

        System.out.println(function.apply("lakshey"));

        System.out.println(f.apply("lakshey", 5));

        System.out.println(fun.apply( 5));

        System.out.println(function.andThen(functionChain).apply("lakshey"));


    }
}
