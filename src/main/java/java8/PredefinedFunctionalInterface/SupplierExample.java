package java8.PredefinedFunctionalInterface;

import java.util.Date;
import java.util.function.Supplier;

/*
Supplier is used where you dont provide any input but only output
like method to generate something get DATE and all
only return value

 */
public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Date> s = () -> new Date();

        System.out.println(s.get());
    }
}
