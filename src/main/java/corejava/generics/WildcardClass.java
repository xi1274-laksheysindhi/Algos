package corejava.generics;

import java.util.Arrays;
import java.util.List;

public class WildcardClass {

// upperbound wildcard, These wildcards can be used when you want to relax the restrictions on a variable.
// For example, say you want to write a method that works on List < integer >, List < double >, and List < number > ,
// you can do this  using an upper bounded wildcard.
    public static void addUpperbound(List<? extends Number> list) {
        System.out.println(list);

    }

// Lowerbound wildcard
//It is expressed using the wildcard character (‘?’), followed by the super keyword, followed by its lower bound: <? super A>

    public static void addLowerBound(List<? super Integer> list)
    {
        System.out.println(list);
    }
//Unbounded Wildcard: This wildcard type is specified using the wildcard character (?), for example, List. This is called a list of unknown type. These are useful in the following cases
//When writing a method which can be employed using functionality provided in Object class.
//When the code is using methods in the generic class that don’t depend on the type parameter
    private static void printlist(List<?> list)
    {

        System.out.println(list);
    }


    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<String> list3 = Arrays.asList(new String[]{"Lakshey", "Sindhi"});

        addUpperbound(list1);
        addLowerBound(list1);
        //addLowerBound(list3);


    }
}
