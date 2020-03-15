package string;

import java.util.HashSet;
import java.util.Set;

public class PermutationsOfString {

    static Set<String> findPermutations(String s) {
        Set<String> perms = new HashSet();
        if (s.length() == 0) {
            perms.add(s);
            return perms;
        }
        char first = s.charAt(0);
        String rem = s.substring(1);
        Set<String> permutations = findPermutations(rem);
        Set<String> per = new HashSet<>();
        permutations.stream().forEach(permutation -> {
            for (int i = 0; i <= permutation.length(); i++) {
                per.add(generatePermutation(permutation, first, i));
            }
        });

        return per;
    }

    static String generatePermutation(String s, char initial, int i) {
        String begin = s.substring(0, i);
        String end = s.substring(i);


        return begin+initial+end;
    }

    public static void main(String[] args) {
        String s = "abcd";
        findPermutations(s);
    }
}
