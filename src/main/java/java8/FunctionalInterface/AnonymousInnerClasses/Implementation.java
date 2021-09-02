package java8.FunctionalInterface.AnonymousInnerClasses;

/*
Anonymous Class helps to provide implementation to interface , functional interface, abstract class,
If for functional interface  we should use lambda expression but for normal interface where we need to provide
implementation to multiple methods we should use anonymous Inner classes.

*/
public class Implementation {
    public static void main(String[] args) {

      /*  Runnable r = new Runnable() {

            @Override
            public void run() {
                for(int i =0; i < 10; i++) {
                    System.out.println("Child Thread");
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
        for(int i =0; i < 10; i++) {
            System.out.println("Parent Thread");
        }*/

        /*InterfaceWithMultipleAbstactMethods interfaceWithMultipleAbstactMethods = new InterfaceWithMultipleAbstactMethods() {

            @Override
            public void m1() {
               System.out.println("method m1");
            }

            @Override
            public void m2() {
                System.out.println("method m2");
            }
        };

        interfaceWithMultipleAbstactMethods.m1();
        interfaceWithMultipleAbstactMethods.m2();*/

        Parentclass p = new Parentclass() {
            public void m1() {
                System.out.println("Child anonymous Class");
            }
        };

        p.m1();
    }
}
