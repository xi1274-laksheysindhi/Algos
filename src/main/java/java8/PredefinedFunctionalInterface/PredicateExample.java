package java8.PredefinedFunctionalInterface;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;


/*
Predicate is used for if else conditions
We can you predicate where to use true or false
Predicate deals with single input
Bi predicate deals with 2 inputs

Predicate chaining can also be done and of true or false and oring of true or false

 */
class Employee {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class PredicateExample {

    public static void main(String[] args) {

        Predicate<Integer> p = i -> i>2;

        Predicate<Integer> p1 = i -> i<4;

        Predicate<Integer> p2 = i -> i>1;

        IntPredicate i1 = o -> o>2;


        BiPredicate<Integer, String> z = (i,s) -> i == 5 && "lakshey".equalsIgnoreCase(s);

        System.out.println(p.or(p2).test(2));
        System.out.println(p.and(p1).test(3));
        System.out.println(p.and(p1).test(4));
        System.out.println(p.and(p2).test(1));
        System.out.println(z.test(5,"lakshey"));
        System.out.println(z.test(6,"lakshewy"));
        System.out.println(i1.test(6));




    }
}
