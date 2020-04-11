package string;

import java.util.ArrayList;
import java.util.List;

public class PermutationinString567 {

    private static final int MAX = 256;

    public static boolean compare(char[] s, char[] p) {
        for(int i =0 ; i < MAX; i++) {
            if(s[i] != p[i]) {
                return false;
            }
        }
        return true;
    }

    public static  boolean checkInclusion(String s1, String s2) {

        if(s2.length() == 0 || s1.length() == 0 || s1.length() > s2.length()) {
            return false;
        }

        char[] stingArr = new char[MAX];
        char[] stringPattern = new char[MAX];

        for(int i = 0; i < s1.length(); i++) {
            stingArr[s2.charAt(i)]++;
            stringPattern[s1.charAt(i)]++;
        }
        if(compare(stingArr, stringPattern)) {
            return true;
        }

        for(int i = s1.length(); i < s2.length(); i++) {
            stingArr[s2.charAt(i)]++;
            stingArr[s2.charAt(i-s1.length())]--;

            if(compare(stingArr, stringPattern)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
      /*  String pattern = "abc";
        String input = "cbaebabac";*/

        String pattern = "aa";
        String input = "baa";
        checkInclusion(input, pattern);
    }



}
