package java8.DefaultAndStaticMethods;

interface Z {

  default void m1() {
      System.out.println("Z interface");
  }
}

interface X {

    default void m1() {
        System.out.println("X interface");
    }
    // Object class methods cant be oveerided in interface as default methods.
   /* default int hashCode() {
        return 10;
    }*/
}

// Ambiqiuos condition as both interface Z and X has m1 default method
// and class MultipleInheritanceInJava8 implements both X and Z so we need to override it in implementation
class MultipleInheritanceInJava8 implements Z,X {

    // Default methods | extenstion methods can only be used in interfaces not in class
    /*default void test() {

    }*/

    // now we have overiden m1 from interfaces and called m1 method of X interface
    @Override
    public void m1() {
        X.super.m1();
    }

    public static void main(String[] args) {
        MultipleInheritanceInJava8 multipleInheritanceInJava8 = new MultipleInheritanceInJava8();
        multipleInheritanceInJava8.m1();
    }
}