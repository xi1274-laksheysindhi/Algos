package string;

import java.util.*;

public class GroupsofSpecialEquivalentStrings893 {

    public static int groupsofSpecialEquivalentStrings(String[] s) {
        Set set = new HashSet();
        for (int i = 0; i < s.length; i++) {
            StringBuilder sb = new StringBuilder();
            List<Character> even = new ArrayList<>();
            List<Character> odd = new ArrayList<>();
            for (int j = 0; j < s[i].length(); j++) {
                if (j % 2 == 0) {
                    even.add(s[i].charAt(j));
                } else {
                    odd.add(s[i].charAt(j));
                }
            }
            Collections.sort(odd);
            Collections.sort(even);
            for (Character ch : even) {
                sb.append(ch);
            }
            for (Character ch : odd) {
                sb.append(ch);
            }

            set.add(sb.toString());
        }
        return set.size();

    }

    public static void main(String[] args) {
        String[] ch = {"abc", "acb", "bac", "bca", "cab", "cba"};


        System.out.println(groupsofSpecialEquivalentStrings(ch));
    }
}
