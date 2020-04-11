package string;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsinaString438 {

    private static final int MAX = 256;

    public static boolean compare(char[] s, char[] p) {
        for(int i =0 ; i < MAX; i++) {
            if(s[i] != p[i]) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> index = new ArrayList<>();

        if(s.length() == 0 || p.length() == 0 || p.length() > s.length()) {
            return index;
        }

        char[] stingArr = new char[MAX];
        char[] stringPattern = new char[MAX];

        for(int i = 0; i < p.length(); i++) {
            stingArr[s.charAt(i)]++;
            stringPattern[p.charAt(i)]++;
        }
        if(compare(stingArr, stringPattern)) {
           index.add(0);
        }

        for(int i = p.length(); i < s.length(); i++) {
            stingArr[s.charAt(i)]++;
            stingArr[s.charAt(i-p.length())]--;

            if(compare(stingArr, stringPattern)) {
                index.add(i-p.length()+1);
            }
        }
        return index;
    }

    public static void main(String[] args) {
      /*  String pattern = "abc";
        String input = "cbaebabac";*/

        String pattern = "aa";
        String input = "baa";
        findAnagrams(input, pattern);
    }




}