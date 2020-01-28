package string;

import java.util.*;

public class CompareStringsByFrequencyOfTheSmallestCharacter1170 {

    public static int[] compareStringsByFrequencyOfTheSmallestCharacter(String[] queries, String[] words) {
         int[] d = new int[queries.length];
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for(String query : queries) {
            char[] c = query.toCharArray();
            Arrays.sort(c);
            a.add(new String(c).lastIndexOf(c[0])+1);
        }

        for(String word : words) {
            char[] c = word.toCharArray();
            Arrays.sort(c);
            b.add(new String(c).lastIndexOf(c[0])+1);
        }
        Collections.sort(b);
        for(int i = 0; i  < a.size(); i++) {
            for(int j = 0; j  < b.size(); j++) {
                if(b.get(j) > a.get(i)) {

                    d[i] = b.size() - j;
                    break;
                }
            }

        }
        return d;
    }

    public static void main(String[] args) {
        String[] queries = {"bba","abaaaaaa","aaaaaa","bbabbabaab","aba","aa","baab","bbbbbb","aab","bbabbaabb"};
        String[] words = {"aaabbb","aab","babbab","babbbb","b","bbbbbbbbab","a","bbbbbbbbbb","baaabbaab","aa"};
        System.out.println(compareStringsByFrequencyOfTheSmallestCharacter(queries, words));
    }

}
