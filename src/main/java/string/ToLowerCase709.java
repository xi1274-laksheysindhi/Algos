package string;

public class ToLowerCase709 {


    public static String toLowerCase(String string) {
        string = string.toLowerCase();
        return string;
    }

    public static void main(String[] args) {
        String string = "Hello";
        string = toLowerCase(string);
        System.out.println(string);

        String s = "HELLO";
        s = toLowerCase(s);
        System.out.println(s);
    }
}
