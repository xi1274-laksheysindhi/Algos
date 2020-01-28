package string;

import java.util.ArrayList;
import java.util.List;

public class GoatLatin824 {

    public static String goatLatin(String string) {
        String[] s = string.split(" ");
        List vovel = new ArrayList();
        vovel.add('a');
        vovel.add('e');
        vovel.add('i');
        vovel.add('o');
        vovel.add('u');
        vovel.add('A');
        vovel.add('E');
        vovel.add('I');
        vovel.add('O');
        vovel.add('U');
        string = "";
        for (int i = 0; i < s.length; i++) {
            if (!vovel.contains(s[i].charAt(0))) {
                string = string +  s[i].substring(1,s[i].length())+s[i].charAt(0);
            } else {
                string = string+s[i];
            }
            string = string+"ma";
            for (int z=0; z<= i; z++) {
                string = string+"a";
            }
            string = (i != s.length-1) ? string+" " : string;
        }

        return string;
    }

    public static void main(String[] args) {
        String string = "I speak Goat Latin";
        string = goatLatin(string);
        System.out.println(string);
    }

}
