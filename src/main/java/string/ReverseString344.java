package string;

import java.util.Arrays;

public class ReverseString344 {
    public static void reverseString(char[] ch) {
        char[] cho = Arrays.copyOf(ch, ch.length);

       for(int i = cho.length ; i > 0 ; i--) {
           ch[cho.length - i] = cho[i-1];
       }

    }

    public static void main(String[] args) {
        char[] ch = {'h','e','l','l','o'};

        reverseString(ch);
       System.out.println(ch);
    }

}
