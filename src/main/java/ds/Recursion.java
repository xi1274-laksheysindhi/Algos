package ds;

public class Recursion {

    public static void main(String[] args) {

        System.out.println(fact(10));

    }



    private static int fact(int n)
    {
        // wrong base case (it may cause
        // stack overflow).
        if (n == 100) {
            return 1;
        }
        else {
            return n * fact(n - 1);
        }
    }

}