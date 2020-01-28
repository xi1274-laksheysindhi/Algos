package companies;

public class Test {

    public static int raiseToPower(int number, int power) {
        int result= number*number;
        return raiseToPower(result,power-1);

    }

    public static void main(String[] arg) {
        System.out.println(raiseToPower(2,4));
    }
}
