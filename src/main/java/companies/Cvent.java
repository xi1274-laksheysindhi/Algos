package companies;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cvent {

    static int solution(String string) {
        Map<String, List<Integer>> m = new HashMap<>();
        Integer diffrence = -1;
        for (int i = 0; i < string.length() - 1; i++) {
            String substring = string.substring(i, i + 2);
            if (m.containsKey(substring)) {
                m.get(substring).add(i);
            } else {
                List<Integer> s = new ArrayList<>();
                s.add(i);
                m.put(substring, s);
            }

        }
        for (Map.Entry<String, List<Integer>> entry : m.entrySet()) {
            List<Integer> l = entry.getValue();
            if (l.size() > 1) {
                diffrence = diffrence > l.get(l.size() - 1) - l.get(0) ? diffrence : l.get(l.size() - 1) - l.get(0);
            }
        }
        return diffrence;

    }

    public static void main(String[] args) {
        String s = "";
        solution(s);
    }
}
