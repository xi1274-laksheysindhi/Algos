package java8.FunctionalInterface;

public class ImplementationClass {

    public static void main(String[] args) {
        // implementation provided to functional interface using lamda expressions
        ExampleChildInterface exampleChildInterface = () -> {
            System.out.println("hello");
        };
        exampleChildInterface.m1();

      /*  ExampleFIWithReturnType exampleFIWithReturnType = i -> {
            return i*i;
        };

        System.out.println(exampleFIWithReturnType.square(10));*/

     /* ExampleFIWithReturnType exampleFIWithReturnType = s -> {
          return s.length();
      };
        System.out.println(exampleFIWithReturnType.length("lakshey"));*/

     ExampleFIWithReturnType exampleFIWithReturnType = (i,j) -> {
         return i+j;
     };
        System.out.println(exampleFIWithReturnType.add(10,12));
    }
}
