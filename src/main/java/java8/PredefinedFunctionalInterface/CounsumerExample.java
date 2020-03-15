package java8.PredefinedFunctionalInterface;


import java.util.function.BiConsumer;
import java.util.function.Consumer;

/*
Consumer is used where you dont expect return something
Just performing a task
no return value

BiConsumer is where we can provide 2 inputs but still no return value

 */
public class CounsumerExample {
    public static void main(String[] args) {
        Consumer<Employee> c = emp -> System.out.println(emp.name);

        c.accept(new Employee(10, "lakshey"));
        c.accept(new Employee(20, "qweertt"));
        c.accept(new Employee(30, "asdfg"));

        BiConsumer<Employee, Integer> bc = (emp, number) -> {
            System.out.println(emp.name);
            System.out.println(number);
        };

        bc.accept(new Employee(10, "lakshey"), 8142221);
    }


}
